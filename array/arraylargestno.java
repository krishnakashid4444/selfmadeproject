package array;

public class arraylargestno {

	public static void main(String[] args) {
		 
		int [] a= {5,7,1,9};
		int large = Integer.MIN_VALUE;
		for(int i=0; i <a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
				
			}
		}
		System.out.println(large);

	}

}
