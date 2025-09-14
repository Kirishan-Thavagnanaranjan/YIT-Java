import java.util.Scanner;


class Retry{
	
	public static void main(String args[]) {
		
		double tax =0.0;
		double productPrice = 0.0;
		double percentage = 0;
		double netTotal = 0;
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.print("Please enter the product price : ");
			if (in.hasNextDouble()){
				productPrice = in.nextDouble();
				
				if (productPrice > 0){
					break;
				}
				else {
					System.out.println("The product Price must be positive");
				}
			}
				
			else{
				System.out.println("Invalid product price!");
				in.next();
			}
		}
			
			
			if ((productPrice >0) && (productPrice <= 100000)){
				percentage = 5;
			}
			 else if ((productPrice >100000) && (productPrice <= 300000)){
				 percentage = 8;
			 }
			 else if ((productPrice >300000) && (productPrice <= 500000)){
				percentage = 12;
			 }
			 else if ((productPrice >500000)){
				 percentage =20 ;
			 }
			 
			 tax = productPrice * percentage /100;
			 netTotal =  productPrice + tax;
			 
			 
			 System.out.println(" You Entered product price is " +productPrice);
			 System.out.println(" You tax is  " +tax);
			 System.out.println(" You net total product price is " +netTotal);
	}
}
			 
			 
	