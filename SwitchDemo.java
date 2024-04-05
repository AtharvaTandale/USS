import java.util.Scanner;

class SwitchDemo1
{
	public static void main(String[] args)
	{
		int no1 = 0;
		int no2 = 0;
		int opt = 0;S
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		no1 = sc.nextInt();
		no1 = sc.nextInt();
		
		System.out.println("1.Addition 2.Sub 3. Mult 4.Div");

		switch(opt)
		{
			case 1: System.out.println("Addition is "+(no1+no2));
				break;

			case 2: System.out.println("Substraction is "+(no1-no2));
				break;

			case 3: System.out.println("Multiplication is "+(no1*no2));
				break;

			case 4: System.out.println("Division is "+(no1/no2));
				break;
S
			default: System.out.println("Enter proper operation");
				break;
		}
		
	}
}