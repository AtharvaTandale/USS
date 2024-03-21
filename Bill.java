import java.util.Scanner;

class Bill
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity");

		int qty = sc.nextInt();
	
		System.out.println("Enter the rate");
		float rate = sc.nextFloat();

		System.out.println("Enter the name of product");
		String productname = sc.next();

		float bill = 0;
		bill = rate*qty;
		System.out.println("The rate : " +rate);
		System.out.println("The quantity : " +qty);
		System.out.println("The bill : Rs." +bill+"/-");
		
	}
}