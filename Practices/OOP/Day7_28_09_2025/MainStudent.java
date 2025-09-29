class MainStudent{
	
	public static void main(String args[]){
		StudentOL var1 = new StudentOL();
		var1.setStudent();
		var1.getStudent();
		
		StudentOL var2 = new StudentOL();
		var2.setStudent(2000);
		var2.getStudent();
		
		StudentOL var3 = new StudentOL();
		var3.setStudent("Kirishanth");
		var3.getStudent();
		
		StudentOL var4 = new StudentOL();
		var4.setStudent(5000 , "Lilaniya");
		var4.getStudent();
		
		StudentOL var5 = new StudentOL();
		var5.setStudent("Rakini",6000);
		var5.getStudent();
		
	}
}