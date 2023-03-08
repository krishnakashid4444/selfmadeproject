package String;

public class palindromestring {

	public static void main(String[] args) {
		
		
		String str="MoM";
		
		 String rev="";
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 rev=rev+str.charAt(i);
		 }
		 System.out.println(rev);
		 
		 if(rev.equals(str))      // rev==str will not work because comparing address 
		 {
			 System.out.println("it is a palindrome string");
		 }
		 else
		 {
			 System.out.println("it is not a palindrome number");
		 }

	}

}
