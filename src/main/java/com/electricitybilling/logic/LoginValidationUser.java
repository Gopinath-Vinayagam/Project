package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;

import java.io.InputStream;
import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

import java.sql.DriverManager;
public class LoginValidationUser {

		public static String LoginValidationUser(String email, String password) throws Exception {
			// Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			System.out.println(connection);
			String query = "SELECT * FROM electricity_registration_details WHERE email_id='" + email + "'";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			String mail = null;
			String Password = null;
			String custo=null;
			String name=null;
			while (rs.next()) {
				mail = rs.getString("email_id");
				Password = rs.getString("PASSWORD");
				custo=rs.getString("customer_id");
				name=rs.getString("customer_name");
			}
			if (mail == null) {
				throw new Exception("No Records Found");
			} else if (Password.equals(password)) {
				System.out.println("Hello"+name+"");
				System.out.println("Success!!!..Logging you in..");
				System.out.println("Hello"+name+"");
				System.out.println("Email:"+mail+"");
			System.out.println("ID:"+custo+ "");
	
		LoginUpdateDAO.LoginUp(custo);
		
	
				return mail;
			} else {
				
				throw new Exception("Invalid Credentials");
				
				
			}

		}

	
		
	}
