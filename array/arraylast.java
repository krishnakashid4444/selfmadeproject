package array;

public class arraylast {

	public static void main(String[] args) {
		
		

	}
	
	public static int [] addToLast(int element, int []a)
	{
		int []b=new int[a.length + 1];
		b[b.length - 1] = element;
		for(int i= 0; i< a.length;i++)
		{
			b[i]=a[i];
			
		}
		return b;
	}
	
	public static int[] addToStart(int element, int[]a)
	{
		int[] b= new int[a.length + 1];
		b[0]=element;
		for(int i=0;i<a.length;i++)
		{
			b[i+1]=a[i];
			
		}
		return b;
	}

}
