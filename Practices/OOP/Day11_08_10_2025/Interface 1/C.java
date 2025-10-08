class C extends A implements IB{
	int z;
	
	C(){
		this.z = 40;
	}
	void getZ(){
		System.out.println("Cz : "+this.z);
	}
	public void getY(){
		System.out.println("Cy : " +this.Y);
	}
}
