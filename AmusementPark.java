class AmusementPark{

int AmusementParkID;
int sqFeet;
String typeOfPlays[];
int noOfStalls;
String location;

public AmusementPark(){
	this();// error: recursive constructor invocation
	System.out.println("default")
}
public AmusementPark(int AmusementParkID, int sqFeet , String typeOfPlays[] , int noOfStalls , String location){

this.AmusementParkID = AmusementParkID;
this.sqFeet = sqFeet;
this.typeOfPlays = typeOfPlays;
this.noOfStalls =noOfStalls;
this.location = location;
displayDetails();




}
public void enjoy()
{
	for(int play =0 ; play<typeOfPlays.length ;play++)
	{
System.out.println("These are the Plays in AmusementPark :"+typeOfPlays[play]);
}



}
public void displayDetails(){

System.out.println("AmusementPark ID :"+this.AmusementParkID);
System.out.println("Dimension of AmusementPark is : "+this.sqFeet+"sqfeet");
System.out.println("Number of Food Stalls in AmusementPark :"+this.noOfStalls);
System.out.println("Location of AmusementPark : "+this.location);



}
}