import java.util.Scanner;

class CallBill{
	
	public static void main(String args[]){
		double callMin = 0 ;
		double bill = 0;
		
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter your call's Minutes : ");
		callMin = scan.nextDouble();
		
		if (callMin > 0){
			if((callMin >= 1) && (callMin <=30)){
				bill = callMin * 2;
			}
			else if ((callMin > 30 ) && (callMin <= 60)){
				bill = 60 + (callMin-30) * 1.5;
			}
			else if ((callMin >60) && (callMin<= 120)){
				bill =  60 + 30*1.5 + (callMin - 60) * 1;
			}
			else if (callMin > 120 ){
				bill = 60 + 30 *1.5 + 60 * 1 +(callMin-120)*0.5 ;
			}
			System.out.println("Your bill amount is " +bill + "rs");
		}
		else{
			System.out.println("Please enter the possitive value! ");
		}
	}
}
			
		
		