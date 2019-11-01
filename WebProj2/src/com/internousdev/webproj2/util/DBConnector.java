package com.internousdev.webproj2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnector {
private static String drivaerName="com.mysql.jdbc.Driver";


private static String url="jdbc:mysql://localhost/test1db";


private static String user="root";


private static String password="mysql";

public Connection getConnection(){
	Connection con=null;
	try{
		Class.forName(drivaerName);
		con=DriverManager.getConnection(url,user,password);
	}catch (ClassNotFoundException e){
		e.printStackTrace();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return con;
}
}
