import java.util.Scanner;

class StudentsMarks{
	
	public static void main(String args[]){
		int studentCount = 0 ;
		int subjectCount = 0;
		int subjectCountValidCheck;
		int studentCountValidCheck;
		int markValidCheck;
		double average= 0;
		
		
		Scanner in = new Scanner(System.in);
		
		//Get the student count and validate that 
		
		while (true){
			System.out.print("Enter the number of students : ");
			if (in.hasNextInt()){
				studentCountValidCheck=in.nextInt();
				if (studentCountValidCheck > 0){
					studentCount= studentCountValidCheck;
					break;
				}
				else {
					System.out.println("Student count must be entered in positive numbers");
				}
			
			}
		else {
			System.out.println("Invalid Input.Number of students must be in numbers!");
			in.next();
		}
		}
		
		//Get the subject count and validate that
		while(true){
			System.out.print("Enter the number of subjects : ");
			if(in.hasNextInt()){
				subjectCountValidCheck = in.nextInt();
				if(subjectCountValidCheck>0){
				subjectCount = subjectCountValidCheck;
				break;
				}
				else{
				System.out.println("Subject count must be entered in positive numbers");
				}
			}
			else{
				System.out.println("Invalid Input.Number of students must be in numbers!");
				in.next();
			}
		}
		
		
		//Array construct
		
		double [][] markArray = new double[studentCount][subjectCount];
		String [] studentName = new String[studentCount];
		double [] total = new double[studentCount];
		
		//Values assign to the array
		
		for (int i = 0; i<studentCount;i++){
			System.out.print("Enter the student " +(i+1) +" name : ");
			studentName[i] = in.next();
				for (int j=0; j<subjectCount; j++){
					while(true){
					System.out.print("Enter the " + studentName[i] + "'s mark " + (j+1) + ": ");
					if(in.hasNextInt()){
						markValidCheck = in.nextInt();
						if((markValidCheck >= 0) && (markValidCheck <=100)){
							markArray[i][j] = markValidCheck;
							total[i] += markValidCheck ;
							break;
						}
						else{
							System.out.println("Marks must be between 0-100 !");
						}
					}
					else{
						System.out.println("Invalid input! Marks must be in numberical value");
						in.next();
					}
					}
				}
				System.out.println("\n****************************************************************");
		}
		
		//Show the Student's marks,total and average
		
		for (int i=0; i<studentCount; i++){
			System.out.println(studentName[i] + "'s marks are ");
			for (int j=0; j<subjectCount; j++){
				System.out.println("\t  mark " +(j+1) + " is : " + markArray[i][j]);
			}
			System.out.println(studentName[i] + "'s total mark is : " + total[i]);
			average = total[i] / subjectCount;
			System.out.println(studentName[i] + "'s average mark is : "  +average);
			System.out.println("\n****************************************************************");
		}
					
			
			
	}
}
		
		