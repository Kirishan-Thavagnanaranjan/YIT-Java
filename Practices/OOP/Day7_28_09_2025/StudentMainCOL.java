class MainStudentCOL{
	
	public static void main(String args[]){
		
		StudentCOL var1 =  new StudentCOL();
		var1.getStudent();
		StudentCOL var2 =  new StudentCOL(2000);
		var2.getStudent();
		StudentCOL var3 =  new StudentCOL("Lilaniya");
		var3.getStudent();
		StudentCOL var4 =  new StudentCOL(4000 , "Rakini");
		var4.getStudent();
		StudentCOL var5 =  new StudentCOL("Ranjan" , 5000);
		var5.getStudent();
	}
}