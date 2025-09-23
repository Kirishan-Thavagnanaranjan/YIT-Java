class student2{
	int id ;
	String name;
	
	void setStudent(int id,String name){
		this.id=id;
		this.name = name;
	}
	
	void getStudent(){
		System.out.println("id : " +this.id);
		System.out.println("name : "+this.name);
	}
}