class Players
{
	int playerId = 0;
	String playerName;
	String playerTeam;

	void playerInfo(int i, String n, String t)
	{
		playerId =i;
		playerName=n;
		playerTeam=t;
		
	}

	void Display()
	{
		System.out.println("Player id is : "+playerId);
		System.out.println("Player name is : "+playerName);
		System.out.println("Player team is : "+playerTeam);
	}
	

	public static void main(String args[])
	{
		Players obj = new Players();
		obj.playerInfo(7,"Xyz","Pune");
		obj.Display();

		obj.playerInfo(8,"Abc","Mumbai");
		obj.Display();
		
	}
}