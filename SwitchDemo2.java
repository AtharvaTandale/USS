import java.util.Scanner;

class SwitchDemo2
{
	public static void main(String[] args)
	{
		int choice = 0;
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(" 1.Additon\n 2.Substraction\n 3.Division\n 4.Multiplication");
		choice = sc.nextInt();

		System.out.println("Enter 2 number");
		a = sc.nextInt();
		b = sc.nextInt();

		switch(choice)
		{
			case 1:System.out.println("Addition is "+(a+b));
			break;

			case 2:System.out.println("Substraction is "+(a-b));
			break;

			case 3:System.out.println("Division is "+(a/b));
			break;

			case 4:System.out.println("Multiplication is "+(a*b));
			break;

			default:System.out.println("enter valid user choice");
			break;
		}
	}
}