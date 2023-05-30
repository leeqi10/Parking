package edu.xhu.web.service;

import edu.xhu.web.dao.UserDao;
import edu.xhu.web.po.Userinf;
import edu.xhu.web.servlet.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    //创建dao实例化
    private UserDao userDao = new UserDao();

    public Userinf userLogin(String user, String password) throws Exception {
        //写出业务逻辑
        logger.info("===进入service层===");
        Userinf userinf = userDao.userLoginByUser(user,password);
        return userinf;
    }
}
