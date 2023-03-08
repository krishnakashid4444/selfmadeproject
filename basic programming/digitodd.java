package javaed;

public class digitodd {

	public static void main(String[] args) {
		
		int n= 2345;
		
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				System.out.println(d);
			}
			n=n/10;
		}
		

	}

}
