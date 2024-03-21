class Swap
{
	public static void main(String[] args)
	{
		
		int a = 10;
		int b = 20;
		System.out.println("Value before swapping of a is "+a+"value of b is "+b);
		a +=b;
		b =a-b;
		a -=b;


		System.out.println("Value of a is "+a+"value of b is "+b);
		
	}
}