import java.util.Scanner;

class Denomination
{
	public static void main(String[] args)
	{
		int amount = 0;
		int note = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		amount = sc.nextInt();
		
		note = amount/1000;
		System.out.println("1000 x "+note);
		amount = amount % 1000;

		note = amount/500;
		System.out.println("500 x "+note);
		amount = amount % 500;

		note = amount/200;
		System.out.println("200 x "+note);
		amount = amount % 20;

		note = amount/100;
		System.out.println("100 x "+note);
		amount = amount % 100;

		note = amount/50;
		System.out.println("50 x "+note);
		amount = amount % 50;
		
		note = amount/20;
		System.out.println("20 x "+note);
		amount = amount % 20;

		note = amount/10;
		System.out.println("10 x "+note);
		amount = amount % 10;
		
		note = amount/5;
		System.out.println("5 x "+note);
		amount = amount % 5;

		note = amount/2;
		System.out.println("2 x "+note);
		amount = amount % 2;

		note = amount/1;
		System.out.println("1 x "+note);
		amount = amount % 1;
				
	}
}