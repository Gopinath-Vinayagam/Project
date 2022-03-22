
import java.util.Scanner;

public class TypeOfConsumer  {
	public static void TypeConsume() {
		System.out.println("CHOOSE CONSUMER TYPE D - domestic or C- commercial");
  
   	Scanner input=new Scanner(System.in);
   	String type=input.nextLine();
   	String str= "d";
   	String Type=type.toLowerCase();
   	if (type.equalsIgnoreCase(str)) {
   		DomesticBillCalculate.DomesticBill();
   		
   	}
   	
   	else
   	{
   		CommercialBillCalculator.CommercialBill();
   	}
   
   	System.out.println(type);
   	
	}

}
