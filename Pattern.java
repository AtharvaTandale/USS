import java.util.*;

class Pattern
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines");
		int no = sc.nextInt();

		Pattern obj = new Pattern();
		obj.Display(no);
	}

	public void Display(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}