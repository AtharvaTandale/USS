import java.util.*;

class Addition1
{
	public static void main(String[] args)
	{
		Addition1 obj = new Addition1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		obj.Addition(x,y);
	}

	public void Addition(int x, int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}