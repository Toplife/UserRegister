package com.david.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBUtils {
	private static Connection con;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@ITA-031-W7.corp.oocl.com:1521:XE","David","david");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ResultSet executeQuery(String sql) {
		try {
			con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void executeUpdate(String sql) {
		try {
			con = getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			if(!con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
