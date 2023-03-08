// wap to all lowercase character to uppercase character and upper case character into lowercase


package String;

public class lowerupper {

	public static void main(String[] args) {
		
		String s="PYThone";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&&a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
			else if(a[i] >='A' && a[i] <='Z')
			{
				a[i]=(char)(a[i]+32);
			}

	    }
		s=new String(a);
		System.out.println(s);
	}
}


		

		
		
	



