package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;
import com.electricitybilling.logic.*;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommercialBillCalculator {
	private static Logger log = LogManager.getLogger(Registervalid.class);

	 static void CommercialBill() throws Exception {
		log.info("Enter the consumed unit");
	   	 int units=0;
	   	Scanner input=new Scanner(System.in);
	   	units=input.nextInt();
	   	double billpay=0;
	billpay=units*7.35;
	 System.out.println("Bill to pay : " + billpay);
	 String billpay1=String.valueOf(billpay);
	 String unit=String.valueOf(units);

	 System.out.println("Enter customerid for updation");
	 String customerid=input.next();
	 BillAmountUpdationDAO.BillUpdate(unit,billpay1,customerid);
	}

}
