package com.electricitybilling.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.electricitybilling.logic.AdminLogin;

public class DuePenDAO {
public static void Duepen(String custid,String due,String pen,String billstat)throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//System.out.println(connection);
	//System.out.println(query);
	java.sql.Statement statement=connection.createStatement();
	Statement mystatement = connection.createStatement();
	
	//ResultSet query1=mystatement.executeQuery ("select reg_date from electricity_billing_details where customer_id='"+custid+"';");

	String query2="UPDATE electricity_billing_details SET  bill_due_date= '"+due+"',penalty='"+pen+"',billing_status='"+billstat+"' WHERE customer_id='"+custid+"';";
		
	
//	while(query1.next())
//	{
//		System.err.println(query1.getString("reg_date"));  
//	}
//	String obj=query1.getString("reg_date");
//	System.out.println(obj);
//	AdminLogin.AdminEntry(obj);
	int rows=mystatement.executeUpdate(query2);
	connection.close();
	}

	
	
}

