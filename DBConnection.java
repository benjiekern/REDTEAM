package com.cognizant.CogniCloth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String jdbc_URL="jdbc:mysql://localhost:3306/";
	Connection con;
	public DBConnection()
	{
		try
		{
		this.con = DriverManager.getConnection(jdbc_URL);
		if (this.con !=null)
			{
				System.out.print("MySQL is connected.");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}
}