class ZOO{

int ZOOID;
int sqFeet;
String typesOfSections[];
int old;
String location;

public ZOO(int ZOOID, int sqFeet , String typesOfSections[] , int old , String location){

this.ZOOID = ZOOID;
this.sqFeet = sqFeet;
this.typesOfSections = typesOfSections;
this.old =old;
this.location = location;
displayDetails();




}
public void animals()
{
	for(int tiger =0 ; tiger<typesOfSections.length ;tiger++)
	{
System.out.println("These are the Sections in ZOO :"+typesOfSections[tiger]);
}



}
public void displayDetails(){

System.out.println("ZOO ID :"+ZOOID);
System.out.println("Dimension of ZOO is : "+sqFeet+" sqfeet");
System.out.println("This ZOO is: "+old+" years old");
System.out.println("Location of ZOO : "+location);



}
}