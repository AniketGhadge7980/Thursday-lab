
public class Pattern_7 {

	public static void main(String[] args) {
int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{
					if(j%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}

	}

}
