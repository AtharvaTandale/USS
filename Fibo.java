//Write a program in java which print no of  terms from user and print fibonanci serie upto that term

import java.util.*;

class Fibo
{
	public static void main(String args[])
	{
		int no1=0;
		int no2 = 1;
		int no3,i;
		int term = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of term");
		term = sc.nextInt();
		System.out.println(" "+no1);
		System.out.println(" "+no2);

		for(i=3;i<=term;i++)
		{
			no3 = no1+no2;
			System.out.println(" "+no3);
			no1=no2;
			no2=no3;
		}
	}
}