import java.util.Scanner;

class ElseifLadder
{
	public static void main(String[] args)
	{
		int no1 = 0;
		int no2 = 0;	
		int no3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number ");
		no1 = sc.nextInt();

		System.out.println("Enter 2nd number ");
		no2 = sc.nextInt();

		System.out.println("Enter 3rd number ");
		no3 = sc.nextInt();

		if(no1>no2 && no1>no3)
		{
			System.out.println("number 1 is greatest");
		}

		else if(no2>no1 && no2>no3)
		{
			System.out.println("number 2 is greatest");
		}

		else
		{
			System.out.println("number 3 is greatest");
		}		
	}
}