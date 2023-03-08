// write a program to check two strings are rotation of each other. eg xyz zxy



package String;

public class rotationalstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="xyz";
		String s2="zxy";
		if(s1.length()== s2.length())
		{
			s1=s1+s1;
			if(s1.indexOf(s2)!=-1)  // index not found then it will give -1
			{
				System.out.println("the string are rotational");
			}
			else
			{
				System.out.println("the string are not rotation");
			}
		}
		else
		{
			System.out.println("length are not same");
		}
		

	}

}
