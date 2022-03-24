package com.electricitybilling.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.electricitybilling.logic.UserRegistration;

public class DeleteRegisterUserDAO {

	public static void DeleteRegUser(String delete)throws Exception {
	//delete querry
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			//System.out.println(connection);
			//System.out.println(query);
			java.sql.Statement statement=connection.createStatement();
			String query1="DELETE FROM electricity_billing_details WHERE customer_id = '"+delete+"';";

			String query2="DELETE FROM electricity_registration_details WHERE customer_id = '"+delete+"';";
			//System.out.println(query1);
			int rows=statement.executeUpdate(query1);
			int rows1=statement.executeUpdate(query2);

			connection.close();
			
			
		}

	}

}
