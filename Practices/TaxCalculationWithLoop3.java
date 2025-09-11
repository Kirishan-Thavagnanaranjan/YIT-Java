import java.util.Scanner;

class TaxCalculationWithLoop{
	
	public static void main(String args[]){
		
		boolean check = true;
		double productPrice = 0;
		double tax = 0;
		double netTotal = 0 ;
		double percentage = 0;
		
		Scanner in = new Scanner(System.in);
		
		
		while(true){
			System.out.print("Please enter your prduct price : ");
			if(in.hasNextDouble()){
				productPrice = in.nextDouble();
				
				if (productPrice >0){
					break;
				}
				else {
					System.out.println("Price must be greater than 0 ");
				}
			}
			else {
				System.out.println("Invalid Input! Please enter the number ");
				in.next();
			}
			}
		
		
		
		
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
		 
		 
		 