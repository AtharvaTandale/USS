import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		no = sc.nextInt();
		
		if(no % 2 == 0)
		{
			System.out.println("Number is even");
		}

		else
		{
			System.out.println("Number is odd");
		}
		
	}
}