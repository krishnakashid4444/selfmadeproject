package pattern;

public class lollipop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int n=5;
			
			for(int r=0;r<=n;r++) //--------------> row
			{
				for(int c=1;c<=n;c++)  /// ------------> column
				{
					if(r==5||r==3||(c==1&&r>=3)||(c==5&&r>=3)||(c==3&&r<=3))
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


		


