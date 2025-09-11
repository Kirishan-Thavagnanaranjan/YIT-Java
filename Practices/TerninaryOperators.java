import java.util.Scanner;

class TerninaryOperator{
	
	public static void main(String args[]){
		int marks = 0 ;
		String result = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		marks = in.nextInt();
		if ((marks >= 0) && (marks <=100)){
		result = (marks <= 50 ) ? "fail" : "pass";
		System.out.println("Your result is " +result);
		}
		else{
			System.out.print("Please enter the correct marks !");
		}
	}
}	