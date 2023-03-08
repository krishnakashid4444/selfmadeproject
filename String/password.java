package String;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String password=sc.nextLine();
		boolean isUpper=false, isLower=false,isNumeric=false,isSpecial=false;
		
		for(int i=0;i<password.length();i++)
		{
			if(password.charAt(i)>='A'&& password.charAt(i)>='Z')
{
	isUpper=true;
	
	
}
			else if(password.charAt(i)>='a'&&password.charAt(i)>='z')
			{
				isLower=true;
				
			}
			else if(password.charAt(i)>='0'&&password.charAt(i)<='9')
			{
				isNumeric=true;
				
			}
			else 
			{
				isSpecial=true;
			}
			
			
		}
		if(isUpper&&isLower&& isNumeric&&isSpecial&&password.length()>=8)
		{
			System.out.println("password is strong");
		}
		else
		{
			System.out.println("password is weak");
		}

	}

}
