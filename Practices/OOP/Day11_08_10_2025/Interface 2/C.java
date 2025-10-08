class C implements IA,IB{
	
	int z;
	
	C(){
		this.z = 40;
	}
	
	void getZ(){
		System.out.println("Cz : " + this.z);
	}
	
	public void getX(){
		System.out.println("Cx : " + this.X);
	}
	public void getY(){
		System.out.println("Cy : " + this.Y);
	}
}