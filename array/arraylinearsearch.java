package array;

public class arraylinearsearch {

	public static void main(String[] args) {
		
		int []a= {2,4,3,5,1};
		int search=4;           // take variable as which is not present in array
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				b=true;
				System.out.println("the element at index at"+i);
				break;
			}
		}
		
		if(b==false)
		{
			System.out.println("not present");
		}
		

	}

}
