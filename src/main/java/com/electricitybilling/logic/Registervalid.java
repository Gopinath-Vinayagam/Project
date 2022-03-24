package com.electricitybilling.logic;
import java.math.BigInteger;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.electricitybilling.DAO.RegistrationDAO;

public class Registervalid {
	
	static Scanner i = new Scanner(System.in);
	private static Logger log = LogManager.getLogger(Registervalid.class);
	public static void menu() throws Exception {
		
		log.info("'WELCOME TO Electricity Billing App'");
		log.info("Enter your option");
log.info("Enter 1 for Register");
log.info("Enter 2 for Login");
log.info("Enter key for Admin Login");

		int option = i.nextInt();
		while (option >= 4) {
	log.info("Enter a valid key");
			option = i.nextInt();
		}

		// enter option register or login
		if (option == 1) {
			RegistrationMain.registration();
		} else if (option == 2) {
			RegistrationMain.logininputs();
		} else if (option == 3) {
			
			AdminLogin.AdminEntry();
		}
	}

	public static void validatingRegistration(UserRegistration car) throws Exception {
		int iscustomerNoValid = customerNoValidation(car.customerNo);
		int isNameValid = nameValidation(car.Name);
		int isUserNameValid = userNameValidation(car.userName);
		int isMobileNumberValid = userMobileNumberValidation(car.userMobileNumber);
		int isAgeValid = userAgeValidation(car.userAge);
		int isuserAddress = userAddressValidation(car.userAddress);

		int isEmailIdValid = userEmailIdValidation(car.userEmailId);
		int isClassValid = userClassValidation(car.userClass);
		int isPasswordValid = userPasswordValidation(car.userPassword);
		if (iscustomerNoValid + isNameValid + isUserNameValid + isMobileNumberValid + isAgeValid + isuserAddress
				+ isEmailIdValid + isClassValid + isPasswordValid ==9) {
	log.info("YOU REGISTERED SUCCESSFULLY");
	log.info("Enter 1 to go back Main menu");
			RegistrationDAO.insertUser(car);
			int t = i.nextInt();
			while (t != 0 || t <= 1) {
				menu();
				t = i.nextInt();
			}
			
		} else {
			throw new Exception("Please Re-Enter Your Details");
		}
	}

	
					
		
		public static int customerNoValidation(BigInteger customerNo) throws Exception {
			if (customerNo != null) {
				return 1;
			} else {
				throw new Exception("Enter a Valid NUMBER");
			}
		}
		
		
		
		public static int nameValidation(String Name) throws Exception{
						if(Name!=null) {
							return 1;
						}
						else
						{
							throw new Exception("enter a valid name");
						}
					}
		
					
		public static int userNameValidation(String userName) throws Exception {
			if (userName != null) {
			return 1;
		} else {
				throw new Exception("Enter a Valid User Name");
			}
		}
		            public static int userMobileNumberValidation(String userMobileNumber )throws Exception{
		            	char[] mobile=userMobileNumber.toCharArray();
		            	if(mobile.length==10) {
		            		for(char i:mobile) {
		            			
		            			if(Character.isAlphabetic(i))
		            			{
		            				throw new Exception("enter only numeric values");
		            			}
		            		}
		            	}
						return 1;
		            }
			
			public static int userAgeValidation(int userAge)throws Exception
			{
				if(userAge<0)
				{
					throw new Exception("enter a valid age");
				}
				else
				{
					return 1;
				}
			}
			public static int userAddressValidation(String userAddress) throws Exception {
				if (userAddress != null) {
					return 1;
				}
				else {
					throw new Exception("Enter a Valid User Address");
				}
			}
			
			
		   public static int userEmailIdValidation(String useremail)throws Exception{
			  if(useremail.contains("@"))
			  {
				  return 1;
			  }
			  else
			  {
				  throw new Exception("enter valid email id");
			  }
		  }
		   public static int userClassValidation(String userOrAdmin)throws Exception{
				if(userOrAdmin.equals("Domestic")||userOrAdmin.equals("Commercial")) {
					return 1;
				}
				else {
					throw new Exception("enter user or admin alone");
				}
			}
		   public static int userPasswordValidation(String userPassword)throws Exception
		   {
			   if(userPassword.length()>8) {
				   return 1;
			   }
			   else
			   {
				   throw new Exception("enter a valid password");
			   }
		   }
		   
				}

