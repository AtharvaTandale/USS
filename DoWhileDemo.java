import java.util.*;

class DoWhileDemo
{
	public static void main(String [] args)
	{
		int no,sum=0;
		char opt;

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter any number");
			no=sc.nextInt();
			sum=sum+no;
			System.out.println("Do you want to add another numbr? y/n");	
			opt = sc.next().charAt(0);
			
		}while(opt=='y' || opt=='Y');

		System.out.println("Sum is "+sum);
	}
}