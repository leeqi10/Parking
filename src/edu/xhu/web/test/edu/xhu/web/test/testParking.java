package edu.xhu.web.test;

import edu.xhu.web.util.JDBCUtils;

import java.io.IOException;

public class testParking {
    public static void main(String[] args) throws IOException {
        JDBCUtils.ProcessingJDBC("jdbc.properties");

    }
}
