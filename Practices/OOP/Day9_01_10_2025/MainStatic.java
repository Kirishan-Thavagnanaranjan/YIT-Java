class MainStatic{
	
	public static void main(String args[]){
		AStatic var1 = new AStatic();
		var1.x = 30;
		var1.getx();
		
		AStatic var2 = new AStatic();
		var2.getx();
		var1.getx();
		var2.x = 50;
		var2.getx();
		var1.getx();
		AStatic.x = 70;
		AStatic.getx();
		var1.getx();
	}
}	