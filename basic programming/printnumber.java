// write a program to print 1 to 5

package javaed;

public class printnumber {
	
	
	public static void number(int n)     // method recursion
	{
		if (n<=5)
		{
			System.out.println(n);
			n++;
			number(n);
			
		}
		
	}

	public static void main(String[] args) {
	
           number(1);
           
	}

}
