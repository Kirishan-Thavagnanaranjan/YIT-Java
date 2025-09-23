class ReturnStudent{
	String fname;
	String lname;
	
	ReturnStudent(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}
	
	String getFullName(){
		// System.out.println(this.fname + " "+this.lname);
		return this.fname + " "+this.lname;
	}
}
	