import java.util.Scanner;

class IfDemo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("How are you feeling??");
		String feeling = sc.next();	

		if(feeling.equals("hungry"))
		{
			System.out.println("User is hungry, order some food");	
		}			

	}
}