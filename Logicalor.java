class Logicalor
{
	public static void main(String[] args)
	{
		char ch = 's';
	
		if(!(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'))
		{
			System.out.println("Given character is vowel");
		}
		else
		{
			System.out.println("Given character is consoant");
		}
	}
}