package com.electricitybilling.DAO;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisteredUserDetailsDAO{
	public static void LoginValidationUser() throws Exception {
	// Step 1 : Database Driver ( Optional)
	Class.forName("com.mysql.cj.jdbc.Driver");

	// Step 2: Get the Connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
			"rev_user", "rev_user");
	System.out.println(connection);

	System.out.println("Customer ID          Customer Name          User Name          Phone No          Age          Address                     Email                 Consumer Type" );
	Statement mystatement = connection.createStatement();
	ResultSet codequery=mystatement.executeQuery("SELECT*FROM electricity_registration_details;");
    while(codequery.next())
    {
        System.err.println(codequery.getString("customer_id")+" --------> "+codequery.getString("customer_name")+" -------->  "+codequery.getString("user_name")+" -------->   "+codequery.getString("phone_no")+"   -------->  "+codequery.getString("user_Age")+"  -------->  "+codequery.getString("address")+"  -------->   "+codequery.getString("email_id")+" -------->  "+codequery.getString("consumer_Type"));  
     
}

}}
