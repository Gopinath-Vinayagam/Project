package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;

import java.io.InputStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class AdminLogin {
	private static Logger log = LogManager.getLogger(Registervalid.class);

	public static void AdminEntry() throws Exception{
		log.info("enter the adminid & passkey");
		Scanner In=new Scanner(System.in);
		String adminid=In.next();
		String passkey = In.next();
		
		
		
		if(adminid.equals("gopinathvinayagam@gmail.com")  && passkey.equals("1009")) {
		
		log.info("PRESS  1  FOR BILL ENTRY PRESS   ");
		log.info("PRESS  2  TO VIEW REGISTERED USER DETAILS");
		log.info("PRESS  3  TO ENTER BILL STATUS    ");
		log.info("PRESS  4  TO Delete User ");
		log.info("PRESS  5  TO ENTER DUE DATE AND PENALTY    ");
		
		int Options=0;

      	Scanner input=new Scanner(System.in);
      	Options=input.nextInt();
		if(Options==1) {
			
	   		
			TypeOfConsumer.TypeConsume();
	   		
	   		
	   		
		}
		else if( Options==2) {
			RegisteredUserDetailsDAO.LoginValidationUser();
			
			
		}
		else if( Options==3) {
			
			
			EnterBillingStatusDAO.LoginValidationUser();

		
		}
		
		else if( Options==4) {
			
			log.info("Enter the name");	
		//	Scanner cus=Scanner(System.in);
			String delete=In.next();
				DeleteRegisterUserDAO.DeleteRegUser(delete);
		}
		else if( Options==5) {
			log.info("customerid");
			String custid=In.next();
		
			log.info("due date");
			String due=In.next();
			log.info("penalty");

			String pen=In.next();
			log.info("billStatus");
			String billstat=In.next();
			DuePenDAO.Duepen(custid,due,pen,billstat);
		}

	}
		else
		{
			log.error("ONLY user can login here...............!");
    		System.out.println("enter 0 to exit");
			System.exit(0);
		}
	}
}
