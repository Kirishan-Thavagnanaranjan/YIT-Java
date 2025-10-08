class FinalKeyB extends FinalKeyA{
	
	int y;
	
	FinalKeyB(){
		this.y = 30;
	}
	
	void gety(){
		System.out.println("By : " +this.y);
	}
	// void getx(){
		// System.out.println("Bx : "+this.X);
	// }  ------we can't override the method because we used final keyword in method------ 
}