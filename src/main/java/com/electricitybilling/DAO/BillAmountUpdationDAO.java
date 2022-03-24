package com.electricitybilling.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import com.electricitybilling.logic.UserRegistration;

public class BillAmountUpdationDAO {

	public static void BillUpdate(String unit,String billpay,String customerid)throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		//System.out.println(query);
		java.sql.Statement statement=connection.createStatement();
		String query2="UPDATE electricity_billing_details SET finalized_total = '"+billpay+"',unit_consumed='"+unit+"',bill_amount='"+billpay+"' WHERE customer_id='"+customerid+"';";
		//System.out.println(query1);
		
		int rows1=statement.executeUpdate(query2);


		
		connection.close();
		}

	
		
	}


