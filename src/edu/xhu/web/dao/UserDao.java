package edu.xhu.web.dao;

import edu.xhu.web.util.JDBCUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
    private final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void userLoginByUser(String user,String password) throws IOException {
        logger.info("===进入dao层===");
        //执行sql
        String sql ="";
        //获取连接
        Connection connection = JDBCUtils.ProcessingJDBC("jdbc.properties");
        //获取PreparedStatement
        PreparedStatement preparedStatement = JDBCUtils.getPreparedStatement(connection,sql);

    }
}
