 package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;
import java.math.BigInteger;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Exception.DBException;
public class RegistrationMain {


	private static Logger log = LogManager.getLogger(Registervalid.class);

	static Scanner sc = new Scanner(System.in);

	public static void registration() {
log.info("Enter your customerNo");
		BigInteger customerNo = sc.nextBigInteger();
log.info("Enter your Name");
		String Name = sc.next();
log.info("Enter user Name");
		String userName = sc.next();
log.info("Enter your Mobile Number ");
		String userMobileNumber = sc.next();
log.info("Enter your Age");
		int userAge = sc.nextInt();
log.info("Enter your Address");
		String userAddress = sc.next();
log.info("Enter your Consumer Type (mention it as DomestiConsumer or CommercialConsumer)");
		String userClass = sc.next();
log.info("Enter your E-mail ID");
		String userEmailId = sc.next();
log.info("Enter your Password");
		String userPassword = sc.next();
		UserRegistration car = new UserRegistration(customerNo,Name, userName, userMobileNumber, userAge,userAddress, userClass,userEmailId,userPassword);
		try {
		Registervalid.validatingRegistration(car);
		} catch (Exception e) {
	log.info("error..!!" + e.getMessage());
		}
	}

	public static void logininputs() throws DBException
	{
	log.info("Enter+ your EmailId");
	String email=sc.next();
	log.info("Enter your Password");
	String password=sc.next();
	try
	{
	//loginValidation.loginValidator(pen);
		LoginValidationUser.LoginValidationUser(email,password);
	}catch(Exception e)
	{log.error("error..!!"+e.getMessage());
	}
	}
}

