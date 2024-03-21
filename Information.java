//to accept the name of student, mark of 2 subs and print total and average

import java.util.Scanner;

class Information
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of student ");
		String name = sc.next();
			
		System.out.println("Enter the marks of 1st subject");
		int m1= sc.nextInt();
			
		System.out.println("Enter the marks of 2nd subject");
		int m2= sc.nextInt();		
		
		System.out.println("Name is : "+name);
		System.out.println("Marks of 1st subject are : "+m1);
		System.out.println("Marks of 2nd subject are : "+m2);

		int total = m1+m2;
		System.out.println("Total is : "+total);
		
		float avg = total/2;
		System.out.println("Average is : "+avg);	
		
	}
}

