import java.lang.*;
import java.util.*;

class Armstrong
{
	public static void main(String[] args)
	{
		int no,rem,num,digit=0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		no = sc.nextInt();
		num = no;

		while(num>0)
		{
			num = num%10;
			digit++;
			num = num/10;
		}

		num = no;

		while(num>0)
		{
			rem = num%10;
			sum = sum+(Math.pow(rem,digit));
			num = num/10;
		}

		if(sum==no)
		{
			System.out.println("It is armstrong number "+no);
		}
		else
		{
			System.out.println("It is not armstrong number "+no);
		}
	}
}