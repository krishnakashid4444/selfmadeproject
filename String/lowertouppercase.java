package String;

import java.util.Scanner;

public class lowertouppercase {

	public static void main(String[] args) {
	
		String s="pyYTHON@@@1457";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&&a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		s=new String(a);
		System.out.println(s);
		
		

	}

}


// Strign ----->Array------>Stirng


