class Day02_Operators{
	
	public static void main(String args[]){
		
		//Arithmatic Operations  
		int X = 10;
		int Y = 3;
		
		
		System.out.println("X is a " + X);
		System.out.println("Y is a " + Y);
		System.out.println("\n");

		System.out.println("Arithmetic Operations \n");
		System.out.println("X + Y = " +(X+Y));
		System.out.println("X - Y = " +(X-Y));
		System.out.println("X * Y = " +(X*Y));
		System.out.println("X % Y = " +(X%Y));
		System.out.println("X / Y = " +(X/Y));
		System.out.println("\n");
		
		
		//Relational Operators
		System.out.println("Relational Operations \n");
		System.out.println("X == Y : " +(X==Y));
		System.out.println("X != Y : " +(X!=Y));
		System.out.println("X > Y : " +(X>Y));
		System.out.println("X < Y : " +(X<Y));
		System.out.println("X >= Y : " +(X>=Y));
		System.out.println("X <= Y : " +(X<=Y));
		System.out.println("\n");
		
		
		
		//Asssign Arthimetic Operation
		System.out.println("Assignment Arithmetic Operations \n");
		X+=5;
		System.out.println(X);
		
		X-=5;
		System.out.println(X);
		
		X/=5;
		System.out.println(X);
		
		X*=5;
		System.out.println(X);
		
		X%=5;
		System.out.println(X);
		
		
		//Incremental and Decremental values 
		X=10;
		
		System.out.println("Here X is is a " +X);
		
		System.out.println("X++ using Prefix " +(X++)); //prefix
		System.out.println("++X using Postfix " +(++X)); //post fix
		
		System.out.println("Here X is is a " +X);
		
		System.out.println("X-- using Prefix " +(X--)); //prefix
		System.out.println("--X using Postfix " +(--X));//post fix
		
		
		
		int a=10;
		int b=3;
		int c=5;
		
		a=++b + c++;
		
		System.out.println(a);//9
		System.out.println(b);//4
		System.out.println(c);//6
		
		
		b= a-- + --b - c++;
		System.out.println(a);//8
		System.out.println(b);//6
		System.out.println(c);//7
		
		c=--c - ++a - ++c + --b;
		System.out.println(a);//9
		System.out.println(b);//5
		System.out.println(c);//-5
		
		
		a+=b=-c;
		System.out.println(a);//14
		System.out.println(b);//5
		System.out.println(c);//-5
		
		c=b=a;
		System.out.println(a);//14
		System.out.println(b);//14
		System.out.println(c);//14
		
	}
}