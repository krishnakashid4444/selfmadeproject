package pattern;

public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
			
			for(int r=0;r<=n;r++) //--------------> row
			{
				for(int c=1;c<=n;c++)  /// ------------> column
				{
					if(r+c==n+1 || r==c)
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


		


