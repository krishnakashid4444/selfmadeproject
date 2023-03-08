package javaed;


public class strongnumber1 {

	public static void main(String[] args) {
	   	   
    for(int n=1;n<=1000;n++)
		   
	   {
		    
		     int temp=n;
		     int sum=0;
		   while(n!=0)
		   {
			   int d =n%10;
			   int fact=1;
			   for(int i=1;i<=d;i++)
			   {
				   fact = fact * i;
				   
			   }
			   sum=sum+fact;
			   n=n/10;
			   
		   }
		   if (temp==sum)
	         {
	        	 System.out.println(sum);
	         }
	        n=temp;
	   }
	   
        
	}

}
