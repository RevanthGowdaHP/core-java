class ZOO{

int ZOOID;
int sqFeet;
String typesOfSections[] = {"Food Section","Birds","Reptails","Carnivorus","Aquatic"};
int old;
String location;


public ZOO(){
	this(1,4000,new String[]{"Food Section","Birds","Reptails","Carnivorus","Aquatic"},131,"Mysore");
	System.out.println("Default constructor is invoked");
}


public ZOO(int ZOOID, int sqFeet , String typesOfSections[] , int old , String location){
	
System.out.println("Parameterized constructor is invoked");
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

System.out.println("ZOO ID :"+this.ZOOID);
System.out.println("Dimension of ZOO is : "+this.sqFeet+" sqfeet");
System.out.println("This ZOO is: "+this.old+" years old");
System.out.println("Location of ZOO : "+this.location);



}
}