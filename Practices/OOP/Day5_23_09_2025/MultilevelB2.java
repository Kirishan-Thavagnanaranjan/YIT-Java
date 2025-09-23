class MultilevelB2 extends MultilevelA2{
	
	int y ;
	
	MultilevelB2(int x,int y){
		super(x);
		this.y = y;
	}
	
	void gety(){
		System.out.println("y : "+y);
	}
}