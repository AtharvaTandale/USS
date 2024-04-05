//Write a program which accept no  from user and check weather it is prime or not

import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to chk prime ");
		no = sc.nextInt();

		if(no%1==0 && no%no==0 && no%2!=0) 
		{
			System.out.println("It is prime number "+no);
		}
		else
		{
			System.out.println("It is not prime number "+no);
		}
	}
}
