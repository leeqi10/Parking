package edu.xhu.web.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static final Logger logger = LoggerFactory.getLogger(JDBCUtils.class);

    /**
     *
     * @param JDBCProperties 加载jdbc获取连接
     * @return 返回的是Connection
     * @throws IOException
     */
    public static Connection ProcessingJDBC(String JDBCProperties) throws IOException {
        //通过类加载器获取资源JDBC配置
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream(JDBCProperties);
        //实例化一个配置类
        Properties properties = new Properties();
        //加载配置类
        properties.load(is);
        //分别获得配置文件里面关于JDBC的配置
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");
        //加载驱动
        try {
            Class.forName(driverClass);
            //连接数据库
            Connection connection = DriverManager.getConnection(url,user,password);
            //获取连接
            return connection;
        } catch (ClassNotFoundException e) {
            logger.error("===加载驱动错误请仔细检查对应版本或者依赖包===");
            e.printStackTrace();
        } catch (SQLException e) {
            logger.error("===连接数据库错误===");
            e.printStackTrace();
        }
        logger.info("===连接成功===");
        return null;
    }
    public static PreparedStatement getPreparedStatement(Connection connection,String sql){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return preparedStatement;
        } catch (SQLException e) {
            logger.error("===sql语句出错");
            e.printStackTrace();
        }
        logger.info("===获取sql成功");
        return null;
    }

}
