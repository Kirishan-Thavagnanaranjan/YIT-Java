class StudentConstructor{
	
	int id;
	String name;
	
	StudentConstructor(){
		this.id=1000;
		this.name = "Kirishan";
	}
	
	
	void setStudent(int id,String name){
		this.id = id;
		this.name= name;
	}
	
	void getStudent(){
		System.out.println("Id : "+ this.id);
		System.out.println("name : " +this.name);
	}
	
}