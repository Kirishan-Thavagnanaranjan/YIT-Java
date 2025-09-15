class MainPen{
	
	public static void main(String args[]){
		
		Pen p;
		p = new Pen();
		
		p.brand = "Ten";
		p.color = "Blue";
		p.madeIn = "India";
		p.height = 10;
		p.weight = 15;
		
		p.write();
		
		System.out.println(p.brand);
	}
}
		