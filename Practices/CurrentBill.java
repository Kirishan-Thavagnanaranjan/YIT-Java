import java.util.Scanner;

class CurrentBill{
	
	public static void main(String args[]){
		double units = 0 ;
		double payment = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Units : ");
		units = scan.nextFloat();
		
		// if the user vallue is less than or equal 0 
		
		if (units <= 0){
			System.out.println("Enter the positive value ");
			return;
		}
		
		// user enter the correct value 
		//calculate the payment 
		else{
			if(units <= 90){
				payment = 1000;
			}
			else if ((units > 90) && ( units <=300)){
				payment = 1000 + ((units - 90)*5);
			}
			else if ((units > 300)&&(units <=500)){
				payment = 1000 + (210 * 5) + (units - 300) * 10 ;
			}
			else if (units > 500){
				payment = 1000 + (210 * 5)+ (units - 300) *10;
				payment = payment + (payment * 0.03);
			}
		}
		
		//print the total value 
		System.out.print(payment);
	}
}