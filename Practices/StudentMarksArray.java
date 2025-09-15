import java.util.Scanner;

class StudentMarksArray{
	
public static void main (String args[]){
	
	String studentName = "";
	double validCheck = 0;
	double total = 0;
	double average = 0 ;
	char credit ;
	Scanner in = new Scanner(System.in);
	
	System.out.print("How many Subject are you calculated : ");
	int markCount = in.nextInt();	
	double[] mark = new double [markCount];
	

		System.out.print("Enter the student name : ");
		studentName = in.next();
		for ( int j = 0; j<mark.length; j++){
			System.out.print("Enter the " +(studentName) + "'s mark " + (j+1) + " : ");
			if (in.hasNextDouble()){
					validCheck = in.nextDouble();
				if ((validCheck >= 0 ) && (validCheck<=100)){
					mark[j] = validCheck;
					total += mark[j];
				}
				else{
					System.out.println("Invalid marks please enter the marks between 0-100");
					j--;
 					};
			}
			else{
				System.out.println("Invalid input! Re enter the mark in number... ");
				j--;
				in.next();
			}
			
				
		}
		System.out.println("****************************************");		
		
		
		System.out.println ("**************************************** \n");
		
		average = total/mark.length;
		if (average >=75){
			credit = 'A';
		}
		else if (average >=65){
			credit = 'B';
		}
		else if (average >=55){
			credit = 'C';
		}
		else if (average >=45){
			credit ='S';
		}
		else {
			credit='F';
		};
		
		

			System.out.println((studentName)+ "'s marks are " );
				for (int j =0; j<mark.length; j++){
					System.out.println("mark " + (j+1) + " is " + (mark[j]));
				}
				System.out.println(studentName +"'s total marks is " + (total));
				System.out.println("Average marks is " + (average));
				System.out.println(studentName + "'s credit is " +(credit));
				System.out.println("**************************************** \n");
	}
}
	


	