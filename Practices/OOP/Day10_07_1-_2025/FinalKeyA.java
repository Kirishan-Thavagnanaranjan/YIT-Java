class FinalKeyA {
	static final int X;
	FinalKeyA(){
	// this.X=20; we can't initialize here because 
	}
	
	final void getx(){
		final int z =30; 
		System.out.println("Ax : " +this.X);
		System.out.println("Az : " + z);
		}
		
}