package edu.xhu.web.dao;

import edu.xhu.web.po.Userinf;
import edu.xhu.web.util.JDBCUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public Userinf userLoginByUser(String user, String password) throws Exception {
        logger.info("===进入dao层===");
        //执行sql
        String sql ="select * from userinf where user_name = ?";
        //获取连接
        Connection connection = JDBCUtils.ProcessingJDBC("jdbc.properties");
        //获取PreparedStatement
        PreparedStatement preparedStatement = JDBCUtils.getPreparedStatement(connection,sql);
        //设置占位符
        preparedStatement.setObject(1,user);
        //执行sql获取相应的结果集
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            logger.error("===执行sql失败===");
            e.printStackTrace();
        }
        //只允许获取一个结果集其余的是错误的情况
        int count = 0;
        //实例化一个userinf
        Userinf userinf = new Userinf();
        //解析值目前只解析一些案例
        String userName = null;
        String passwordPlus = null;
        String userPhone = null;
        while (resultSet.next()){
            if (count==1){
                Exception e = new Exception("===有多个名称一样的用户===");
                throw e;
            }
            userName = resultSet.getString("user_name");
            passwordPlus = resultSet.getString("user_pwd");
            userPhone = resultSet.getString("user_phone");
            count++;
        }
        //判断是否登录成功
        if (userName==null){
            logger.info("===不存在改用户名===");
            return null;
        }
        if (passwordPlus.equals(password)){
            logger.info("===登录成功===");
            userinf.setUserName(userName);
            userinf.setUserPhone(userPhone);
            return userinf;
        }
        return null;
    }
}
