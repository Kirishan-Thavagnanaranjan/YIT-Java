class AEncapsulation1{
	
	int x;
	int y ;
	
	AEncapsulation1(){
		this.x = 20;
	}
	
	AEncapsulation1(int y){
		this();
		this.y = y;
		
	}
	
	void getx(){
		System.out.println("X : " +this.x);
		System.out.println("y : " +this.y);
	}
}