// add all the digits from the number


package javaed;

public class digitadd {

	public static void main(String[] args) {
	
		int n=2345;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum = sum + d;
			n=n/10;
			
		}
		System.out.println(sum);
		

	}

}
