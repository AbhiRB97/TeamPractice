package com.teampractice.genericutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtiliy {

	static Driver driver;
	static Connection con;
	
	public void connectDb() throws Throwable {
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(IConstants.JDBCUrl,"root","root");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void closeDb() throws Throwable {
		con.close();
	}
	
	public ResultSet executeQuery(String query) throws Throwable {
		return con.createStatement().executeQuery(query);
	}
	
	public int executeUpdate(String query) throws Throwable {
		return con.createStatement().executeUpdate(query);
	}
	
	public void executeQueryAndVerify(String query, int col, String expData) throws Throwable {
		boolean flag = false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next()) {
			if(result.getString(col).equals(expData)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(expData+" ==> Present in Database");
		}
		else {
			System.out.println(expData+" ==> Not Present in Database");
		}
		
	}

}