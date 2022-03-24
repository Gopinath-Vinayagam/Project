package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
public class DomesticBillCalculate {
	private static Logger log = LogManager.getLogger(Registervalid.class);

	   
		public static void DomesticBill() throws Exception 
	        {   
			System.out.println("Enter the consumed unit");
       	 int units=0;
       	 
       	Scanner input=new Scanner(System.in);
       	units=input.nextInt();
       	
	        	

	 double billpay=0;
	 
	         if(units <=100)
	  {
	       billpay=units*0;
	   }
	 else if( units> 100 && units  <=200)
	  {
	    billpay=(units-100)*1.5+20;
	  }
	 else if(units>200 && units<=500)
	 {
	     billpay=(units-100)*3+30;
	 }
	 else if (units>500) {
		    billpay=(units-100)*4.5+50; 
	 }
	       
	 System.out.println("Bill to pay : " + billpay); 
	 String billpay1=String.valueOf(billpay);
	 String unit=String.valueOf(units);

	 System.out.println("Enter customerid for updation");
	 String customerid=input.next();
	 BillAmountUpdationDAO.BillUpdate(unit,billpay1,customerid);
	      }

	}