import java.util.*;

class Fact
{
	public static void main(String[] args)
	{
		Fact obj = new Fact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int x = sc.nextInt();
		obj.Factorial(x);
	}

	public void Factorial(int y)
	{
		int fact=1;
		int i;

		for(i=1;i<=y;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial is "+fact);
	}
}