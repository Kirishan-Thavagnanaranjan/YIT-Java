class StudentCOL {
	int id ; 
	String name ;
	
	StudentCOL(){
		this.id = 1000;
		this.name = "Kirishan";
	}
	
	StudentCOL(int id ){
		this.id = id ;
		this.name = "Kirishanth";
	}
	
	StudentCOL(String name ){
		this.id = 3000;
		this.name = name;
	}
	
	StudentCOL(int id ,String name ){
		this.id = id ;
		this.name = name;
	}
	
	StudentCOL(String name , int id ){
		this.id = id ;
		this.name = name ;
	}
	
	void getStudent (){
		System.out.println("id : " + this.id);
		System.out.println("name : " +this.name);
	}
}