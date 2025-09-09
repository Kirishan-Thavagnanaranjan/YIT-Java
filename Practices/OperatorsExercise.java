class OperatorsExercise{
	
	public static void main(String args[]){
		int i =15;
		int j = 6;
		int k = 3;
		
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
		
		i = j++ - k++ - --i;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
		
		k=--i - ++j + --k - j--;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
		
		j= ++i - --i + ++j -k++;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
		
		k-=j*=i;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
		
		i=k=j;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("k value is "+k);
	}
}
		