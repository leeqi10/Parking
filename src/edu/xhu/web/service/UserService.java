package edu.xhu.web.service;

import edu.xhu.web.dao.UserDao;
import edu.xhu.web.servlet.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    //创建dao实例化
    private UserDao userDao = new UserDao();
    public void userLogin(String user,String password){
        //写出业务逻辑
        logger.info("===进入service层===");


    }
}
