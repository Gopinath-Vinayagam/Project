package com.electricitybilling.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class EnterBillingStatusDAO {
	public static void LoginValidationUser() throws Exception {
		// Step 1 : Database Driver ( Optional)
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		System.out.println(connection);
		Statement mystatement = connection.createStatement();
		ResultSet codequery=mystatement.executeQuery ( "select electricity_registration_details.customer_id,electricity_registration_details.customer_name,electricity_billing_details.finalized_total,electricity_billing_details.billing_status from electricity_registration_details inner join electricity_billing_details on electricity_registration_details .customer_id = electricity_billing_details.customer_id;");
		
				
	    while(codequery.next())
	    {
	        System.err.println(codequery.getString("customer_id")+"          "+codequery.getString("customer_name")+"          "+codequery.getString("finalized_total")+"          "+codequery.getString("billing_status"));  
	     }
		
		}}


