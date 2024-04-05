//write  program which accept  from user and check weather it is armstrong or not

import java.util.*;

class ArmstrongDemo
{
	public static void main(String[] args)
	{
		int no = 0;
		int sum = 0;
		int rem= 0;
		int temp=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		no = sc.nextInt();
		temp=no;

		while(no>0)
		{
			rem = no%10;
			sum=sum+(rem*rem*rem);
			no= no/10;
		}

		if(temp==sum)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not armstrong number");
		}
	}
		
}