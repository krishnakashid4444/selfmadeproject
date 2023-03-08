package array;

public class arraybinarysearch {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int search=2;
		int sp=0;
		int ep=a.length;
		int mp=(sp+ep)/2;
		while(sp<=ep)
		{
			if (search == a[mp])
			{
				System.out.println("the element is present at"+mp);
				break;
			}
			else if(search >a[mp])
			{
				sp=mp+1;
			}
			else if(search < a[mp])
			{
				ep=mp-1;
			}
			mp= (sp+ep)/2;
		}
           if(sp>ep)
           {
        	   System.out.println("the element is not present");
           }
	}

}
