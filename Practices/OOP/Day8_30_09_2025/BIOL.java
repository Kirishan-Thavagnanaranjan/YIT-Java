class BIOL extends AIOL{
	int y;
	BIOL(){
		this.y = 30;
	}
	
	void gety(){
		System.out.println("By : "+this.y);
	}
	
	void getx(int x){
		System.out.println("Ax : "+super.x);
		System.out.println("Bx : "+x);
	}
}