class TouristPlace{

int agencyID;
int packages;
String placeNames[] = {"Manglore","Udupi","Gokarana","Goa","Apsarakonda Falls"};
int noOfDays;
String mode;

public TouristPlace(){
	this(1,10000,new String[]{"Manglore","Udupi","Gokarana","Goa","Apsarakonda Falls"},12,"Mini Bus");
}

public TouristPlace(int agencyID, int packages , String placeNames[] , int noOfDays , String mode){

this.agencyID = agencyID;
this.packages = packages;
this.placeNames = placeNames;
this.noOfDays =noOfDays;
this.mode = mode;
displayDetails();




}
public void visit()
{
	for(int photo =0 ; photo<placeNames.length ;photo++)
	{
System.out.println("Name of Places to visit :"+placeNames[photo]);
}



}
public void displayDetails(){

System.out.println("Agency ID :"+this.agencyID);
System.out.println("Package price is :Rs "+this.packages);
System.out.println("No of days :"+this.noOfDays);
System.out.println("Mode of Transport : "+this.mode);



}
}