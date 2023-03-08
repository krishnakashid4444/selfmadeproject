package String;

public class maxocurring {

	public static void main(String[] args) {
		
		String s="java";
		char[]a=s.toCharArray();
		
		boolean[]b=new boolean[a.length];
		int max=0;
		char ch=' ';
		
		
		for(int i=0;i<a.length;i++)
		{
			
			if(b[i]==false)
			{
				int count =1;
				 for(int j=i+1; j<b.length;j++)
				 {
					 if(a[i]==a[j])
					 {
						 count++;
						 b[j]=true;
					 }
			}
				 if(count>max)
				 {
					 max=count;
					 ch=a[i];
				 }
			
			 }
		}
		System.out.println(ch);
		

	}

}
