//  wap to print all the digit from the number


package javaed;

public class digitseparate {

	public static void main(String[] args) {
		
		
		int n=2345;
		
		while(n!=0)
		{
			int d=n%10;
			System.out.print(d);
			n=n/10;
		}
		
		
		
	

	}

}
