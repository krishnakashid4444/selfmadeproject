package pattern;

public class diagonal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int n=5;
		
		for(int r=1;r<=n;r++) //--------------> row
		{
			for(int c=1;c<=n;c++)  /// ------------> column
			{
				if(r+c==n+1)
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


	


