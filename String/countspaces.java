// wap to count all the spaces in the string.


package String;

public class countspaces {
	
	
	
	public static void  main(String[]args)
	{
		String str="java is used for oop";
		int count=0;
		
		//System.out.println(str.charAt(0));
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
