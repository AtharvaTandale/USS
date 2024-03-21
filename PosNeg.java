import java.util.Scanner;

class PosNeg
{
	public static void main(String[] args)
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		no = sc.nextInt();

		if(no>=0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}
}