import java.util.Scanner;

class ExamResult{
	
	public static void main(String args[]){
		int mark = 0;
		String result = "";
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		mark = in.nextInt();
		
		if ((mark >= 0) && (mark <= 100)){
		
			if ((mark >= 0) && (mark < 50)){
				result = "Fail";
			}
			else if ((mark >= 50) && (mark<=100)){
				result = "pass";
			}
			System.out.println("Your result is " + result);
			}
		else {
			System.out.println("Enter the correct marks");
		}
		

	}
}