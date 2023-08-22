class SportsManiaReverse
{
static String topBatsman[] = {"Baber Azam","Rassie van der Dussen","Fakhar Zaman","Imam-ul-Haq","Harry Tector","David Warner","Shubman Gill","Quinton de Kock","Virat Kohli","Steve Smith"};
static String topBowlers[] = {"Josh Hazlewood","Mitchell Strac","Rashid Khan","Mohammad Siraj","Matt Henry","Mujeeb Ur Rahman","Trent Boult","Adam Zampa","Shaheen Afridi","Shakib Al Hasan"};
static String topCricketTeams[] = {"AUS","PAK","INDIA","NZ","ENG","SA","BAN","AFG","SL","WI","ZIM","SCO"};
static String topHockeyTeams[] = {"AUSTRALIA","BELGIUM","NETHERLAND","GERMANY","INDIA","ENGLAND","ARGENTINA","SPAIN","NEW ZEALAND","MALAYSIA"};
static String topTennisPlayers[] ={"Alcaraz","Djokovic","Medvedev","Tsitsipas","Ruud","Rune","Rublev","Sinner","Fritz","Tiafoe"};

public static void main(String sports[])
{
	for(int prime = topBatsman.length-1 ; prime >=0 ; prime--)

	{
System.out.println(" Worlds top 10 Batsman are : "+topBatsman[prime]);
}
System.out.println("     -------------------------------");


for(int prime = topBowlers.length-1 ; prime >=0 ; prime--)

	{
System.out.println(" Worlds top 10 Bowlers are : "+topBowlers[prime]);
}
System.out.println("     -------------------------------");





for(int prime = topCricketTeams.length-1 ; prime >=0 ; prime--)

	{
System.out.println(" Worlds top 10 Cricket teams are : "+topCricketTeams[prime]);
}
System.out.println("     -------------------------------");




for(int prime = topHockeyTeams.length-1 ; prime >=0 ; prime--)

	{
System.out.println(" Worlds top 10 Hockey teams are : "+topHockeyTeams[prime]);
}
System.out.println("     -------------------------------");




for(int prime = topTennisPlayers.length-1 ; prime >=0 ; prime--)

	{
System.out.println(" Worlds top 10 Batsman are : "+topTennisPlayers[prime]);
}
System.out.println("     -------------------------------");



}
}