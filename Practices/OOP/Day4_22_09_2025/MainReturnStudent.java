class MainReturnStudent{
	
	public static void main(String args[]){
		
		ReturnStudent stu1 = new ReturnStudent("Kirishan","Thavagnanaranjan");
		String studentFullname = stu1.getFullName();
		System.out.println(studentFullname);
	}
}