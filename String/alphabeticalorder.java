package String;

import java.util.Arrays;

public class alphabeticalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a= {"Biryani","Tikka","Butter chicken"};
		
	         for(int i=0;i<a.length;i++)
	         {
	        	 for (int j=i+1;j<a.length;j++)
	        	 {
	        		 if (a[i].compareTo(a[j])>0)    // compairing ascii values to alphabet
	        		 {
	        			 String temp=a[i];
	        			 a[i]=a[j];
	        			 a[j]=temp;
	        		 }
	        	 }
	         }
	         System.out.println(Arrays.toString(a));
		

	}
	

}


