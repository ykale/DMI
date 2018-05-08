package com.dmi.datalake.driver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ingest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
			// Establish the Connection
		    String url = "jdbc:datadirect:sforce://test.salesforce.com;SecurityToken=jdFVyo5yfcinEmdVUy0CzOpSY";
		    Connection conn = DriverManager.getConnection(url, "datalake@dmifinance.in", "datat@lake1");

		    // Verify the Connection
		    DatabaseMetaData metaData = conn.getMetaData();
		    System.out.println("Driver Name: " + metaData.getDriverName());
		    System.out.println("Driver Version: " + metaData.getDriverVersion());
		    System.out.println("Database Name: " + metaData.getDatabaseProductName());
		    System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

		    


	}

}
