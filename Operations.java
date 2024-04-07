import java.util.*;

class Operations
{
	public static void main(String [] args)
	{  
		int opt;
		Scanner sc = new Scanner(System.in);
        Operations obj = new Operations();

		do
		{
            System.out.println("************************************************************************************************");
            System.out.println("                                   Welcome to my Application");
            System.out.println("************************************************************************************************");
			System.out.println("Choose your operation");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Factorial");
            System.out.println("6.Fiboncii");
            System.out.println("7.Prime");
            System.out.println("8.Even");
            System.out.println("9.Simple Intrest");
            System.out.println("10.Greatest");
            System.out.println("11.Vowel");
            System.out.println("12.Square");
            System.out.println("13.Cube");
            System.out.println("14.Table");
            System.out.println("15.Reverse");
            System.out.println("16.Weekday");
            System.out.println("17.Month");
            System.out.println("18.TrafficLight");
            System.out.println("19.Leap Year");
            System.out.println("20.Profit Loss");
            System.out.println("21.Grade");
            System.out.println("22.Age");
            System.out.println("23.Area of Rectangle");
            System.out.println("24.Area of Circle");
            System.out.println("25.Perimeter of Circle");
            System.out.println("0.Exit");
			opt=sc.nextInt();

            switch(opt)
            {
                case 0: System.out.println("************************************************************************************************");
                System.out.println("                                  Thank You for using my application");
                System.out.println("************************************************************************************************");
                break;

                case 1: obj.Addition();
                break;

                case 2: obj.Substraction();
                break;

                case 3: obj.Multiplication();
                break;

                case 4: obj.Division();
                break;

                case 5: obj.Factorial();
                break;

                case 6: obj.Fiboncci();
                break;

                case 7: obj.Prime();
                break;

                case 8: obj.Even();
                break;

                case 9: obj.SimpleIntrest();
                break;
                
                case 10: obj.Greatest();
                break;

                case 11: obj.Vowel();
                break;

                case 12: obj.Square();
                break;

                case 13: obj.Cube();
                break;

                case 14: obj.Table();
                break;

                case 15: obj.Reverse();
                break;

                case 16: obj.WeeKDay();
                break;

                case 17: obj.Month();
                break;

                case 18: obj.TrafficLight();
                break;

                case 19: obj.LeapYear();
                break;

                case 20: obj.ProfitLoss();
                break;

                case 21: obj.Grade();
                break;

                case 22: obj.Age();
                break;

                case 23: obj.AreaRectangle();
                break;

                case 24: obj.AreaCircle();
                break;

                case 25: obj.PeriCircle();
                break;

                default: System.out.println("Select valid operation");
			    break;    
            }
		}while(opt!=0);
	}

    public void Addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to add");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Addition is " +(no1+no2));
    }

    public void Substraction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to substract");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Substraction is " +(no1-no2));
    }

    public void Multiplication()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to multiply");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Multiplication is " +(no1*no2));
    }

    public void Division()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        System.out.println("Division is " +(no1/no2));
    }

    public void Factorial()
    {
        int fact = 1;
        int i ;
        int no;
        System.out.println("Enter the number to find fact");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();

        for(i=1;i<=no;i++)
        {
            fact = fact*i;
        }

        System.out.println("Fact is "+fact);
    }

    public void Fiboncci()
    {
        int n1 = 0;
        int n2 = 1 ;
        int n3;
        int no;
        int i = 0;
        
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();

        for(i=1;i<=no;i++)
        {
            n3 = n1+n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public void Prime()
    {
        int no,flag=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        no=sc.nextInt();
        for(i=2;i<=no-1;i++)
        {
            if(no%i==0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag=1;
            }
        }
        if(flag==1)
        System.out.println("Number is prime number "+no);
        else
        System.out.println("Number is not prime number "+no);
    }

    public void Even()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even");
        int no1 = sc.nextInt();
        
        if(no1%2==0)
        {
            System.out.println("It is even number");
        }
        else
        {
            System.out.println("It is odd number");
        }
    }

    public void SimpleIntrest()
    {
        Scanner sc = new Scanner(System.in);
        float p,n,r,si;
        System.out.println("Enter Principle amount, No of year , ROI ");
        p  = sc.nextFloat();
        n = sc.nextFloat();
        r = sc.nextFloat(); 
       
        si = (p*n*r)/100;
        System.out.println("SI is : "+si);
    }

    public void Greatest()
	{
		int a,b,c;
		System.out.println("Enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greatest");
			}
			else
			{	
				System.out.println(c+" is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greatest");
			}
			else
			{	
				System.out.println(c+" is greatest");
			}
		}
	}

    public void Vowel()
	{
		char ch;
		System.out.println("Enter Character ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		System.out.println("Character is "+ch);	
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			if((ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'))
			{
				System.out.println("Given character is vowel");
			}
			else
			{
				System.out.println("Given character is consonant");
			}
		}
		else
		{
			System.out.println("Given character is not alphabet ");
		}
	}

    public void Square()
	{
		int square = 0;

        System.out.println("Enter number to find square : ");
		Scanner sc = new Scanner(System.in);
		int iNo = sc.nextInt();
		
		square =iNo*iNo;
		System.out.println("Square is "+square);

	}

    public void Cube()
	{
		int cube = 0;

        System.out.println("Enter number to find cube : ");
		Scanner sc = new Scanner(System.in);
		int iNo = sc.nextInt();
		
		cube =iNo*iNo*iNo;
		System.out.println("Cube is "+cube);

	}

    public void Table()
    {
        Scanner sc = new Scanner(System.in);
        int no,i;
    
        System.out.println("Enter the number");
        no = sc.nextInt();

        i=1;
        while(i<=10)
        {

            System.out.println(" "+(no*i));
            i++;
        }
    }

    public void Reverse()
    {
        Scanner sc = new Scanner(System.in);
        int no,i,rem;
        int rev=0;
    
        System.out.println("Enter the number to reverse");
        no = sc.nextInt();

        while(no!=0)
        {
            rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        System.out.println("Reversed number: " + rev);
    }

    public void WeeKDay()
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of day : ");
		no = sc.nextInt();

		switch(no)
		{
			case 1: System.out.println("Monday");
			break;

			case 2: System.out.println("Tuesday");
			break;

			case 3: System.out.println("Wednesday");
			break;

			case 4: System.out.println("Thrusday");
			break;

			case 5: System.out.println("Friday");
			break;

			case 6: System.out.println("Saturday");
			break;

			case 7: System.out.println("Sunday");
			break;

			default: System.out.println("Enter valid day");
			break;
		}
	}

    public void Month()
	{
		int no = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of month : ");
		no = sc.nextInt();

		switch(no)
		{
			case 1: System.out.println("January");
			break;

			case 2: System.out.println("February");
			break;

			case 3: System.out.println("March");
			break;

			case 4: System.out.println("April");
			break;

			case 5: System.out.println("May");
			break;

			case 6: System.out.println("June");
			break;

			case 7: System.out.println("July");
			break;		

			case 8: System.out.println("August");
			break;

			case 9: System.out.println("September");
			break;

			case 10: System.out.println("October");
			break;

			case 11: System.out.println("November");
			break;

			case 12: System.out.println("December");
			break;

			default: System.out.println("Enter valid month");
			break;
		}
	}

    public void TrafficLight()
	{
		String light;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select one light\n Red\n Yellow\n Green");
		light = sc.next();

		switch(light)
		{
			case "Red": System.out.println("Red : STOP");
			break; 
		
			case "Yellow": System.out.println("Yellow : WAIT");
			break;

			case "Green": System.out.println("Green : Go");
			break;

			default: System.out.println("Select valid light");
			break;
		}
	}

    public void LeapYear()
	{
		int year = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to chk leap year");
		year = sc.nextInt();

        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println(year + " is a leap year");
        }
        else 
        {
            System.out.println(year + " is not a leap year");
        }
	}

    public void ProfitLoss()
    {
        int amount = 0;
        int base = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base price");
        base = sc.nextInt();

        System.out.println("Enter amount you sold");
        amount = sc.nextInt();
        
        if(amount-base>0)
        {
            System.out.println("We are in profit of Rs. "+(amount-base));
        }
        else if(amount-base == 0 )
        {
            System.out.println("We are in no profit no loss");
        }
        else
        {
            System.out.println("We are in loss of Rs. "+(amount-base));
        }
    }

    public void Grade()
    {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        System.out.println("Enter the marks out of 100");
		marks = sc.nextInt();
			
        if(marks<50)
        {
            System.out.println("Grade F");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("Grade D");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("Grade C");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("Grade B");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("Grade A");
        }
        else
        {
            System.out.println("Grade A+");
        }
    }

    public void Age()
	{
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are adult");
        }
        else if(age>=13 && age<=17)
        {
            System.out.println("You are teenager");
        }
        else
        {
            System.out.println("You are child");
        }
	}

    public void AreaRectangle()
	{
		int area = 0;

        System.out.println("Enter length and breadth");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
        int breadth = sc.nextInt();
		
		area =length*breadth;
		System.out.println("Area is "+area);
	}

    public void AreaCircle()
	{
		float area = 0;

        System.out.println("Enter radius");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
       
		area =3.14f*radius*radius;
		System.out.println("Area is "+area);
	}

    public void PeriCircle()
	{
		float peri = 0;

        System.out.println("Enter radius");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
       
		peri =2*3.14f*radius;
		System.out.println("Perimeter is "+peri);
	}

}

