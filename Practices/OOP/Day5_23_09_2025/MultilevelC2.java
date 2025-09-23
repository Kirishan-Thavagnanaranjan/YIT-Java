class MultilevelC2 extends MultilevelB2{
	
	int z;
	
	MultilevelC2(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	void getz(){
		System.out.println("Z : "+z);
	}
}