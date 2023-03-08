package pattern;

public class letterWM {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int n=5;
		
		for(int r=0;r<=n;r++) //--------------> row
		{
			for(int c=1;c<=n;c++)  /// ------------> column
			{
				if(c==1||c==n||(r==c&&r<=3)||(r+c==n+1&&r<=3))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}