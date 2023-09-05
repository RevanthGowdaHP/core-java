class Museum{

int MuseumID;
int sqFeet;
String typesOfSections[] ;
int old;
String location;

public Museum(){
	this(1,800,new String[]{"Art Section","Craft","History","Cultural","Technology"},140,"Dharamsthala");
	System.out.println("Default constructor is invoked");
}
public Museum(int MuseumID, int sqFeet , String typesOfSections[] , int old , String location){
 // this() is method which is used to link/call the one constructor from another constructor of same class is called constructor chain,and
//this() should be first statement of constructor, this() only used inside the constructor
// this. keyword is used to reslove the conflict between instance and parameter variable of the same class which is having same variableName 

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

System.out.println("Museum ID :"+this.MuseumID);
System.out.println("Dimension of Museum is : "+this.sqFeet+"sqfeet");
System.out.println("This Museum is:"+this.old+" years old");
System.out.println("Location of Museum : "+this.location);



}
}
