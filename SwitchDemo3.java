import java.util.Scanner;

class SwitchDemo3
{
	public static void main(String[] args)
	{
		int month= 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of month");
		month = sc.nextInt();

		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("This month has 31 days");
			break;

			case 2:System.out.println("This month has 28 days");
			break;

			case 4:
			case 6:
			case 9:
			case 11: System.out.println("This month has 30 days");
			break;
			
			default:System.out.println("Enter valid month");
	

		}
	}
}