//WAJP to accept 3 numbers from user and print the substracton of squares of each digit

import java .util.*;

class SubSquare
{
	public static void main(String[] args)

	{
		SubSquare obj = new SubSquare();
		obj.Display();	
	}

	public void Display()
	{
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3 = sc.nextInt();

		int sub = 0;

		sub = ((no1*no1)-(no2*no2)-(no3*no3));
		System.out.println("The result is "+sub);

	}
}

