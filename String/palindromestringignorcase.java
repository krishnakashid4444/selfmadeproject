// trim()
// ignoreCase();
package String;

public class palindromestringignorcase {

	public static void main(String[] args) {
		
		String str="Level";
        str=str.trim();
        String rev="";
        
        for(int i=str.length()-1;i>=0;i--)
        {
        	rev= rev +str.charAt(i);
        	
        }
        if(str.equalsIgnoreCase(rev))
        {
        	System.out.println("String is palindrome");
        }
        else
        {
        	System.out.println("not a palindrome");
        }
	}

}
