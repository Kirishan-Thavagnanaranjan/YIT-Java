import java.util.Scanner;

class StudentsMarks{
	
	public static void main(String args[]){
		int studentCount = 0 ;
		
		Scanner in = new Scanner(System.in);
		
		while (true){
			System.out.print("Enter the number of students : ");
			if (in.hasNextInt()){
			studentCount= in.nextInt();
			break;
		}
		else {
			System.out.println("Invalid Input.Number of students must be in numbers!");
			in.next();
		}
		}
	}
}
		
		