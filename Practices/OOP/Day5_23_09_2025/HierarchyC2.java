class HierarchyC2 extends HierarchyA2{
	
	int z;
	
	HierarchyC2(int x, int z){
		super(x);
		this.z= z;
	}
	
	void getz(){
		System.out.println("z : "+z);
	}
}