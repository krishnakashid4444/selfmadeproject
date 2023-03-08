

package String;

public class removevowels {

	public static void main(String[] args) {
		
		String str = "education is important";
		String str2="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
			{
				str2=str2+str.charAt(i);
			}
			
		}
		System.out.println(str2);

	}

}
