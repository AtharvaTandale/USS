import java.util.*;

class Message
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines");
		int no = sc.nextInt();

		Message obj = new Message();
		obj.Display(no);
	}

	public void Display(int n)
	{
		for(int i =1; i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}