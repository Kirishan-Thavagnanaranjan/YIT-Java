class AbstarctKeyB extends AbstarctKeyA{
	int y;
	
	AbstarctKeyB(){
		this.y = 30;
	}
	
	void getx(){
		System.out.println("Bx : " + super.x);
	}
	
	void gety(){
		System.out.println("By : " +this.y);
	}
	
}