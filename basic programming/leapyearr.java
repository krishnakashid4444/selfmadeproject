package javaed;

public class leapyearr {

	public static void main(String[] args) 
	{  
                int year=1900;
                boolean b=false;
                if(year % 4 ==0)       // to check if leap year
                {
                	 if (year % 100 == 0)       // to check if century year
                	 {
                		 if(year % 400==0)      // check century year
                		 {
                			 b=true;
                		 }else 
                		 {
                			 b=false;
                		 }
                	 }
                	 else
                	 {
                		 b=true;
                	 }
                }
                else 
                {
                	b=false;
                }
                
                if (b== true)
                {
                	System.out.println(" leap year");
                }
                else
                {
                	System.out.println("not leap year");
                }
	}

}
