//write a program to count to total no.of digit in a number


package javaed;

public class totallno {

	
	
	public static void main(String[] args) {
		 int n=2345;
		 int count=0;
		 while(n != 0)
		 {
			 int d= n%10;
			 count++;
			 n=n/10;
		 }
		 System.out.println(count);

	}

}
