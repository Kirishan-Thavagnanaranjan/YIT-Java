package PackB;

import PackA.A;
public class B extends A{
	
	int y ;
	public B(){
		this.y = 50;
	}
	
	public void gety(){
		System.out.println("By : "+this.y);
		getx();
	}
}