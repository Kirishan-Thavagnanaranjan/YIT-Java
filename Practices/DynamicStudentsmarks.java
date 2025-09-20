import java.util.Scanner;

class DynamicStudentsmarks{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int studentNumberValidCheck ;
		int studentNumber;
		int subjectCountValidCheck;
		int subjectCount;
		double markValidCheck;
		
		
		//Get the students count
		while(true){
			System.out.print("Enter the number of students : ");
			if(in.hasNextInt()){
				studentNumberValidCheck = in.nextInt();
				if(studentNumberValidCheck >0){
					studentNumber = studentNumberValidCheck;
					break;
				}
				else{
					System.out.println("Invalid! Student number must be enter the positive value...");
				}
			}
			else{
				System.out.println("Invalid input! Student number must be in numberic value...");
				in.next();
			}
		}
		
		System.out.println("****************************************************************");
		

		
		
		//Array construct
		double[][] studentMark= new double[studentNumber][];
		String[] studentName = new String[studentNumber];
		double[] total = new double[studentMark.length];
		
		
		
		//Get the students name and Subject count
		for (int i=0; i<studentNumber; i++){
		System.out.print("Enter the Student "+ (i+1) + " name : ");
		studentName[i] = in.next();
			while(true){
				System.out.print("Enter the " + studentName[i] + "'s subjects count : ");
				if(in.hasNextInt()){
					subjectCountValidCheck = in.nextInt();
					if(subjectCountValidCheck >0){
						subjectCount = subjectCountValidCheck;
						studentMark[i]  =new double[subjectCount];
						break;
					}
					else{
						System.out.println("Number of subject must be in positive value...");
					}
				}
				else{
					System.out.println("Invalid input! Subject count must be in numberic value...");
					in.next();
				}
			}
			System.out.println("****************************************************************");
		}
			
			
			//Get the students marks
			for (int i =0; i<studentNumber; i++){
				for (int j=0; j<studentMark[i].length;j++){
					while(true){
						System.out.print("Enter the " + studentName[i] +"'s subject " + (j+1) +" mark : ");
						if (in.hasNextDouble()){
							markValidCheck = in.nextDouble();
							if((markValidCheck>=0) && (markValidCheck <=100)){
								studentMark[i][j] = markValidCheck;
								total[i] += studentMark[i][j];
								break;
							}
							else{
								System.out.println("Marks must be between in the 0-100");
							}
						}
						else{
							System.out.println("Invalid input! Marks must be in numberic value..");
							in.next();
						}
					}
					
				}
				System.out.println("****************************************************************");
			}
			
			
			//print the student name ,marks, total and average
			
			for (int i =0; i<studentNumber;i++){
				System.out.println(studentName[i] + "'s marks are ");
				for(int j=0; j<studentMark[i].length;j++){
					System.out.println("\t mark " + (j+1) + " is : " + (studentMark[i][j]));
				}
				System.out.println(studentName[i] + "'s total mark is : " + total[i]);
				System.out.println(studentName[i] + "'s Average mark is : " + (total[i]/studentMark[i].length));
				System.out.println("****************************************************************");
			}				
					
			
			
		}	
	}
		
		