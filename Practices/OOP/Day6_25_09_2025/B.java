class B extends A{
	
	int y;
	
	B(){
		this.y = 70;
	}

	void gety(){
		System.out.println("By : " +y);
	}
	
	void getx(){
		System.out.println("Bx : " +this.x);
	}
	
}