import java.util.Scanner;
public class AdminLogin {
	
	public static void AdminEntry() throws Exception{
		System.out.println("enter the adminid & passkey");
		Scanner In=new Scanner(System.in);
		String adminid=In.next();
		int passkey = In.nextInt();
		
		
		
		if(adminid=="gopinath100" && passkey==1009) {
		
		System.out.println("PRESS  1  FOR BILL ENTRY PRESS  2  TO VIEW REGISTERED USER DETAILS AND 3 TO ENTER BILL STATUS ");
      	 int Options=0;

      	Scanner input=new Scanner(System.in);
      	Options=input.nextInt();
		if(Options==1) {
			System.out.println("Press 1 for Domestic consumer Calculation & Press 2 for Commercial Consumer Calculation ");
	   		
			TypeOfConsumer.TypeConsume();
	   		
	   		
	   		
		}
		else if( Options==2) {
			RegisteredUserDetailsDAO.LoginValidationUser();
			
			
		}
		else if( Options==3) {
			
			EnterBillingStatusDAO.LoginValidationUser();
			

		
		}
	}
		else
		{
			System.out.println("ONLY user can login here...............!");
		}
		}
	
	
	
	

}
