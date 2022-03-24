package com.electricitybilling.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginUpdateDAO {

	public static void LoginUp(String  custo) throws Exception{

		
		// Step 1 : Database Driver ( Optional)
		
		
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Step 2: Get the Connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
						"rev_user", "rev_user");
				System.out.println(connection);
				Statement mystatement = connection.createStatement();
				ResultSet codequery=mystatement.executeQuery ( "select customer_id,finalized_total from electricity_billing_details where customer_id='"+custo+"';");
				
					System.out.println("Customer ID      Bill Amount");	
			    while(codequery.next())
			    {
			        System.err.println(codequery.getString("customer_id")+"---->  RS:"+codequery.getString("finalized_total"));  
			     }
				
				}
		
		
		
	}


