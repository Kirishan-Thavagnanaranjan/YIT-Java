class WhileLoop{
	
	public static void main (String args[]){
		// Exercise one
		int num =1 ;
		while (num <=10){
			System.out.println(num);
			num++;
		}
		
		//print odd numbers
		int a=1 ;
		
		while (a<=10){
			
			if ((a%2)== 1){
				System.out.println(a);
			}
			a++;
		}
		
		//print even numbers
		
		int b=1 ;
		
		while (b<=10){
			
			if ((b%2)== 0){
				System.out.println(b);
			}
			b++;
		}
		
		//print odd numbers AND print * instead of eve numbers
		
		int c =1;
		while (c<=10){
			
			if ((c%2)== 0){
				System.out.println("*");
			}else {
				System.out.println(c);
			}
			c++;
		}
		
		//add the numbers
		
			int d=1 ;
			int total =0;
		
		while (d<=10){
			total += d; 
			System.out.println (total);
			d++;
		}
		
		//multify of 5
			int e=5 ;
		
		while (e<=25){
			System.out.println (e);
			e+=5;
		}
		
		
		//addition of the odd numbers
		
		int g =3;
		
		int add = 1;
		while (g<=10){
			
			if ((g%2)== 1){
				System.out.println(add);
				add += g;
				
			}
			g++;
		}
		
		
		int h=1;
		
		while (h<6){
			int i = 1;
			while (i<4){
				System.out.print(i);
				i++;
			}
			System.out.println(h);
			h++;
		}
		
		
		// 12345 print 5 times
		
		int j=1;		
		while (j<6){
			int k=1;
			while (k<6){
				System.out.print(k);
				
				k++;
			}
			System.out.println("");
			j++;
		};
		
	/*12345
	******
	12345
	******
	12345 */

		
		int l=1;		
		while (l<6){
			if (l%2 == 1){
				int m=1;
				while (m<6){
				System.out.print(m);  
				m++;
				
			}
			System.out.println("");
			}
			else{
			System.out.println("***********");
			}
			
			l++;
		};
		
		
		/*
		11111
		22222
		33333
		44444
		55555
		*/
		
		int m = 1;
		
		while(m<=5){
			int n=1;
			while (n<=5){
			System.out.print(m);
			n++;
			}
			System.out.println("");
			m++;
		}
	}
}
		