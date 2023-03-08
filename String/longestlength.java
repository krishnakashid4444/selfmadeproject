// write a program to find string with longest length in the array

package String;

public class longestlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[]a= {"krishna","krishnakumar","java","normal"};
		int max=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>a[max].length())
			{
				max=i;
			}
				
		}
		
		System.out.println(a[max]);

	}

}


