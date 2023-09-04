class Museum{

int MuseumID;
int sqFeet;
String typesOfSections[];
int old;
String location;

public Museum(int MuseumID, int sqFeet , String typesOfSections[] , int old , String location){

this.MuseumID = MuseumID;
this.sqFeet = sqFeet;
this.typesOfSections = typesOfSections;
this.old =old;
this.location = location;
displayDetails();




}
public void gain()
{
	for(int wow =0 ; wow<typesOfSections.length ;wow++)
	{
System.out.println("These are the Sections in Museum :"+typesOfSections[wow]);
}



}
public void displayDetails(){

System.out.println("Museum ID :"+MuseumID);
System.out.println("Dimension of Museum is : "+sqFeet+"sqfeet");
System.out.println("This Museum is:"+old+" years old");
System.out.println("Location of Museum : "+location);



}
}