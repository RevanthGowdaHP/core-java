class Apartment{

int apartmentID ;
String apartmentName;
String apartmentLocation;
int apartmentFloors;
int noOf2BHKflats;
int noOf3BHKflats;

public Apartment(int id , String apartName, String apartLo ,int apartFloors, int bhk2 , int bhk3){
	apartmentID = id;
	apartmentName = apartName;
	apartmentLocation = apartLo;
	apartmentFloors = apartFloors;
	noOf2BHKflats = bhk2;
	noOf3BHKflats = bhk3;
	System.out.println("Creation of object using constructor");
	
	
}


public void accomadation(){
System.out.println(" Welcome to your New Apartment");
System.out.println(" ..............................");
details();
}


public void details(){
	
System.out.println(" Apartment id is: " +apartmentID);
System.out.println(" Apartment Name is: "+apartmentName);
System.out.println(" Apartment Location is :"+apartmentLocation);
System.out.println(" Number of floors available in Apartment are:"+apartmentFloors);
System.out.println(" Number of 2BHK Flats available are: "+noOf2BHKflats);
System.out.println(" Number of 3BHK Flats available are: "+noOf3BHKflats);
System.out.println("                     ");

}
}