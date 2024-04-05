//Write a program which accept three no from user and find greatest no between them

import java.util.*;

class Greatest
{
	public static void main(String[] args)
	{
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3 = sc.nextInt();	

		if(no1>no2 && no1>no3)
		{
			System.out.println("No1 is greatest");
		}
		else if(no2>no1 && no2>no3)
		{
			System.out.println("No2 is greatest");
		}
		else
		{
			System.out.println("No3 is greatest");
		}
	}
}

/*
	OUTPUT

Enter 3 numbers
10
20
30
No3 is greatest
*/