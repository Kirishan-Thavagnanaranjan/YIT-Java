class StudentParameterConstructor{
	
	int id;
	String name;
	
	StudentParameterConstructor(int id ,String name){
		this.id = id;
		this.name = name;
	}
	
	
	void getStudent(){
		System.out.println("ID : " +this.id);
		System.out.println("Name : "+this.name);
	}
}