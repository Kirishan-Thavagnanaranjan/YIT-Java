class Student{
	
	int id;
	String name;
	int mark1,mark2,mark3;
	
	
	Student(int id ,String name){
		this.id = id;
		this.name = name;
	}
	
	void Student(String name ,int id ){
		this.id = id;
		this.name = name;
	}
	
	//get student marks
	void setMarks(int mark1,int mark2,int mark3){
			this.mark1= mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
	}
	
	int calTotal(){
		int total = this.mark1+this.mark2+this.mark3;
		return total;
	}
	
	double calAvg(int total){
		double avg = total /3;
		return avg;
	}
	
	char getResult(double avg){
		if (avg>=75){
			 return 'A';
		}
		else if(avg >=65){
			 return 'B';
		}
		else if (avg >=55){
			 return 'C';
		}
		else if (avg>=45){
			 return 'S';
		}
		else {
			 return 'F';
		}
	}

	
	
	void display(){
		System.out.println("Id : " +this.id);
		System.out.println("Name : "+ this.name);
		System.out.println("mark 1 : "+this.mark1 + " mark 2 : "+this.mark2 + " mark 3 : " + this.mark3);
		int total = this.calTotal();
		System.out.println("Total is: " +total);
		double avg = this.calAvg(total);
		System.out.println("Average is : "+avg);
		char result = this.getResult(avg);
		System.out.println("Result is : " +result);
	}
}