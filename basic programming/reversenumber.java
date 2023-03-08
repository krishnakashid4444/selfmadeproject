// write a program to print reverse


package javaed;

public class reversenumber {

	public static void main(String[] args) {
		
		
		int n=2345;
		int rev=0;
		
		while(n!=0)
		{
			int d=n%10;
			rev= rev *10 + d;
			n=n/10;
		}
		System.out.println(rev);
		
		
		

	}

}
