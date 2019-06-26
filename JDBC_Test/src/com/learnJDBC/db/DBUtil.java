package com.learnJDBC.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ���ݿ�Ĺ����࣬��Ҫ�Ǵ������ݿ����ӣ������ṩ�������ӵ� Connection ����
 * @author Tang
 *
 */

public class DBUtil {
	private static final String URL="jdbc:mysql://127.0.0.1:3306/godness_test?serverTimezone=GMT";
	private static final String USER="root";
	private static final String PASSWORD="123456";
	
	private static Connection connect = null;
	
	static {    //��̬��������ص�ʱ���ִ�У�ִֻ��һ�Σ�ִ��˳�����ڹ��췽����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConnec() {   //��̬��������ֱ��
		return connect;
	}	
}
