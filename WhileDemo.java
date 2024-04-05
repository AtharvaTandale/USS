import java.util.Scanner;

class WhileDemo
{
	public static void main(String[] ags)
	{
		int no,fact=1,i;
		System.out.println("enter no ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		i=1;
		while(no>=i)
		{
			fact = fact*i;
			i++;
		}
		System.out.println("Fact is "+fact);
	}
}