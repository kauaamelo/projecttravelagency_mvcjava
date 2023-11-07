package com.viagenstka.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSql {
	
	private static final String database_url = "jdbc:mysql://localhost:3306/viagenstka2";
	private static final String user = "root";
	private static final String password = "root";

	 public static Connection createConnection() {
		 
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("DRIVER ENCONTRADO!");  
		   } catch(ClassNotFoundException e) {
			   System.out.println("DRIVER NÃO ENCONTRADO!" + e.getMessage()); 
		   }
		   
		   try { 
			   Connection connection = DriverManager.getConnection(database_url,user,password);
			   System.out.println ("CONECTADO!");
			   return connection;
			   
		   } catch (SQLException e) {
			   System.out.println (e.getMessage());
			   return null;
		   }
}
}
