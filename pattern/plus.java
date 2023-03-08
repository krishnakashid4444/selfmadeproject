
// every pattern should have odd number because it gives center.
// even number cannot give center.

package pattern;

public class plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int t=n/2+1;   // check
		for(int r=0;r<=n;r++) //--------------> row
		{
			for(int c=1;c<=n;c++)  /// ------------> column
			{
				if(c==t||r==t)
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

