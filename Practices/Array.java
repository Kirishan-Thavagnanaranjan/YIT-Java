class Array{
	
	public static void main(String args[]){
		
		int[] x =new int[5];
		x[0] = 5;
		x[1] =10;
		x[2] =15;
		x[3] =20;
		x[4] =25;
		
		int i = 0;
		while (i<5){
			System.out.println(x[i]);
			i++;
		}
		System.out.println("************************************");	
		int j=4;
		while (j>-1){
			System.out.println(x[j]);
			j--;
		}
		
		System.out.println("************************************");
		
		int k =0;
		do{
			System.out.println(x[k]);
			k++;
		}
		while (k<5);
		
		System.out.println("************************************");
		
		int l =4;
		do{
			System.out.println(x[l]);
			l--;
		}
		while (l>-1);
		
		System.out.println("************************************");
		
		
		for (int m=0; m<5; m++){
			System.out.println(x[m]);
		}
		System.out.println("************************************");
		for (int m=4; m>-1; m--){
			System.out.println(x[m]);
		}
			
		
	}
}