package String;

public class duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is programming language it is used to do programming";
		String[]a=s.split(" ");
		boolean []b=new boolean [a.length];
		
		for(int i =0 ;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i].equals(a[j]))
					{
						count++;
						b[j]=true;
						
					}
				}
				if (count>1)
				{
					System.out.println(a[i]+" ");
				}
			}
			
		}
		
		
		

	}

}
