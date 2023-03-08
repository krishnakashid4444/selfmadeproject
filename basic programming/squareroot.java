package javaed;

public class squareroot {

	public static void main(String[] args) {
		 int n=16;
		 double t;
		 double sqrt=n/2;
		 System.out.println(sqrt);
		 
		 do
		 {
			 t=sqrt;
			 sqrt = (t+(n/t))/2 ;    // write same brackets
			 
		 }while (t-sqrt != 0);
		  System.out.println(sqrt);
		  //System.out.println(math.sqrt());
		 

	}

}
