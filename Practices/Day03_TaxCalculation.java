import java.util.Scanner;

class Day03_TaxCalculation{
	
	public static void main(String args[]){
		double productPrice = 0;
		double tax = 0;
		double netTotal = 0 ;
		double percentage = 0;
		
		//Get the product price from the user 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the product price : ");
		productPrice = in.nextDouble();
		
		if (productPrice <= 0){
			System.out.println("Invalid product price. Please enter a positive value.");
		}
		else {
		
		//calculate the Tax 
		
		
		if (( productPrice > 1 ) && ( productPrice <= 100000 )){
			percentage = 5 ;
		}
		else if (( productPrice > 100000 ) && ( productPrice <= 300000 )){
			percentage = 8 ;
		}
		else if ( ( productPrice > 300000 ) && ( productPrice <= 500000 )){
			percentage = 12 ;
		}
		else if (productPrice > 500000){
			percentage = 20;
		}

		//calculate the tax 
		tax = productPrice * (percentage / 100);
		
		//calculate the product price with tax 
		
		netTotal = productPrice + tax;
		
		//Show the prices
		
		System.out.println("Product price is : " + productPrice);
		System.out.println("Product tax is : " + tax);
		System.out.println("Your final payment is  : " + netTotal);
		}
	}
}