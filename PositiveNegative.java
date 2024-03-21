import java.util.Scanner;

class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		int no = sc.nextInt();

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