package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQAConnection {
	
	private static Connection conn;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/sqa";
	static final String USER = "root";
	static final String PASS = "";
	
	public static Connection getConnection() throws Exception{
		if (conn == null){
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		return conn;
	}
}
