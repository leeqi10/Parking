package edu.xhu.web.servlet;

import edu.xhu.web.po.Userinf;
import edu.xhu.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "MyServlet",  //Servlet名
        urlPatterns = "/serv02"   //Servlet访问的url
         )
public class UserController extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    //分层管理，不用spring注入
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("===进入servlet===");
        //登录操作实例,默认以表单提交为按理 contentType:form-data类型
        //解析前端传过来的参数
        Map<String, String[]> params = req.getParameterMap();
        //用户名
        String user = req.getParameter("user");
        //密码
        String password = req.getParameter("password");
        logger.info("===准备进入service层===");
        Userinf userinf = null;
        try {
            userinf = userService.userLogin(user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //根据返回的userinf是否为空来判断是否登录成功
        if (userinf==null){
            logger.info("===登录失败===");
            req.setAttribute("info","登录失败");
            req.getRequestDispatcher("/response.jsp").forward(req,resp);
        }else {
            logger.info("===登录成功===");
            req.setAttribute("userinf",userinf);
            req.getRequestDispatcher("/response.jsp").forward(req,resp);
        }
    }
}
