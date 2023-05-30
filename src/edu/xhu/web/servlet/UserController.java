package edu.xhu.web.servlet;

import edu.xhu.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet",  //Servlet名
        urlPatterns = "/serv02"   //Servlet访问的url
         )
public class UserController extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    //分层管理，不用spring注入
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //登录操作实例,默认以表单提交为按理 contentType:form-data类型
        //用户名
        logger.info("===进入servlet===");
        String user = req.getParameter("user");
        //密码
        String password = req.getParameter("password");
        logger.info("===准备进入service层===");
        userService.userLogin(user,password);
        super.doPost(req, resp);
    }
}
