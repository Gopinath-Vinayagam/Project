package com.electricitybilling.logic;
import com.electricitybilling.logic.*;
import com.electricitybilling.DAO.*;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TypeOfConsumer  {
	private static Logger log = LogManager.getLogger(Registervalid.class);

	public static void TypeConsume() throws Exception {
		
log.info("Press 1 for Domestic consumer Calculation & Press 2 for Commercial Consumer Calculation ");
   	int type=0;
		Scanner input=new Scanner(System.in);
        type=input.nextInt();
   	
        switch(type) {
        case 1:
        	DomesticBillCalculate.DomesticBill();
        	break;
        
       
        case 2:
        	CommercialBillCalculator.CommercialBill();       
        	break;
        
        	default:
        		System.exit(0);
        }
	}
}


