class AmazonPrimeReverse
{
static String englishMovies[] = {"The Wall","Good Night oppy ", "Flight risk","7500","Deep water","Wild Cat","The report","Chemical Hearts","Aeronuts","Shark Water Extinction","The map of the tiny perfect","Coming 2 America","The lie","Beautiful Boy","All the old knives", "Encounter","The big sick","Sherlock","My fault","Reacher","The night manager"};
static String hindiMovies[] = {"Bawaal","Dil Chahta hai","Dil dhadakne do","Gangs of wassipur", "Meri pyaari bindu","Befikare","Welcome","Black Mall","Student of the year","Band baja Bharat","Dil to pagal hai","Hasee to Pasee","Munna bhai M.B.B.S","Hera pheri","Bhadrinath ki Dulaniya","Batla house","Chak de India","Veer Zaara","Sholay","Kati patang","kapoor and sons","Gol mall","Mujse dosti karoge","Gunde","patan","Chennai Express"};
static String teluguMovies[] = {"Vaarasudu","Nani Gangster","v","Dear comread","Geetha govindam","sarileru neekev varu","Rangashalam","Maghadeera","RRR","Tuck Jagadesh","1947","Aaakaashm nee haddu ra", "Anjali CIA","Neene wasthunna","Husharu","Radhe Shyam", "Bhahubali","Thandatti","Chakravyuham","Mem Famous","Rudrangi","Custom","CSI","Two Souls","Mahaam"};
static String kannadaMovies[] = {"hondisi bariyiri","KGF","Raagu","Made in banglore","Critical keerthane","Gantu muute","Maheera","Maya bajar","ASN","Thuruthu nirgamana","One cut","Gubbi mele Bhramhaastra","Ondu motteya kathe","Hope","Hoysala","Gandhadagudi","Beer bal","Yuvararatna","Yellow borad","Kotigobba3","Lanke","Garuda ","Lucky Man","Thirble riding","Dia","Orange"};
static String malayalamMovies[] = {"Neelavelicham","Cold Case","Jai Bheem","Ela veezha poonchira","Kooman","Maalik","Malayalakunju","Ayappanam Koshinam","Home","Kuruthi","Joji","Santhoham","C U soon","The Priest","Virus","Kaduva","Nonsense","Driving license","Archana 31","Gold","Charlie enterprise","Ek mini Katha","Bhramam","JO and JO","Ennalum Nteliyaa","Entada Sanji","Vikram vedha"};


public static void main(String amazonprime[])
{
for(int prime = englishMovies.length-1 ; prime >= 0 ; prime--)

	{
System.out.println(" The English Movies available in AmazonPrime videos are : ");
System.out.println("                                                          ""+englishMovies[prime]);
}
System.out.println("     -------------------------------");


for(int prime = hindiMovies.length-1 ; prime >= 0 ; prime--)

	{
System.out.println(" The Hindhi Movies available in AmazonPrime videos are : "+hindiMovies[prime]);
}
System.out.println("                                                          ");

for(int prime = teluguMovies.length-1 ; prime >= 0 ; prime--)

	{
System.out.println(" The Telugu Movies available in AmazonPrime videos are : "+teluguMovies[prime]);
}
System.out.println("   -----------------------------------");

for(int prime = kannadaMovies.length-1 ; prime >= 0 ; prime--)

	{
System.out.println(" The Kannada Movies available in AmazonPrime videos are : "+kannadaMovies[prime]);
}
System.out.println("   -----------------------------------");


for(int prime = malayalamMovies.length-1 ; prime >= 0 ; prime--)

	{
System.out.println(" The Malyalam Movies available in AmazonPrime videos are : "+malayalamMovies[prime]);
}
System.out.println("   -----------------------------------");


}
}
