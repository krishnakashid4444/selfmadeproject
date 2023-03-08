// write a program to print 10 to 1

package javaed;

public class printnumber1 {
	
	public static void number(int n)
	{
		if(n>=1)
		{
			System.out.println(n);
			n--;
			number(n);
		}
	}

	public static void main(String[] args) {
		
		number(10);
		
		
		

	}

}
