import  java.util.Scanner;

class SwitchCase{
	
	public static void main(String args[]){
		String dayName = "";


		
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter the day  (1-7) : ");
		int day = in.nextInt();
		/*
		switch(day){
			case 1:
			dayName = "Monday";
			break;
			case 2:
			dayName = "Tuesday";
			break;
			case 3:
			dayName = "Wednesday";
			break;
			case 4:
			dayName = "Thursday";
			break;
			case 5:
			dayName = "Friday";
			break;
			case 6:
			dayName = "Saturday";
			break;
			case 7:
			dayName = "Sunday";
			break;
			
			
			default: 
			System.out.println("Enter the correct value !");
		}
		System.out.println("This is a " + dayName);*/
		
		 dayName =  switch(day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "Invalid";
		 };
		 System.out.print("This is " + dayName);
		 
	}
}
		

			
			
		