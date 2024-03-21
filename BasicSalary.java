// Write a program to set basic salary and print da,hra,gross,pf, and net salary
/*
da = 8% of basic
hra = 10% of basic
gross = basic + da + hra 
pf = 2.5% of gross
net = gross - pf
*/

class BasicSalary
{
	public static void main(String[] args)
	{
		float da = 0;
		float hra = 0;
		float gross = 0;
		float net = 0;
		float pf = 0; 
		float salary = 80000 ;
		
		da = (salary*8)/100;
		
		hra = (salary*10)/100;

		gross = salary+da+hra;
		
		pf = (gross*2.5f)/100;

		net = gross - pf;

		System.out.println("Salary is "+salary);
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross is "+gross);
		System.out.println("Net is "+net);
		System.out.println("PF is "+pf);
	}
}

