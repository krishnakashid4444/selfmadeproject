package String;

public class splitstring {

	public static void main(String[] args) {
	   
		
		String s="Welcome to javaworld";
		String[]a =s.split(" ");
		//System.out.println(a.length);
	//	System.out.println(a[0]);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
