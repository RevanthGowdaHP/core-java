class ApartmentDekho{

// className refName = new className();
// refName.variableName = value/literals;
public  static void main(String arg[]){

Apartment look = new Apartment();
look.apartmentID =1;
look.apartmentName = "REGO";
look.apartmentLocation = " VijayNagar";
look.apartmentFloors = 40;
look.noOf2BHKflats = 80;
look.noOf3BHKflats = 40;

// refName.methodName();

look.accomadation();
System.out.println(" Apartment id is: " +look.apartmentID);
System.out.println(" Apartment Name is: "+look.apartmentName);
System.out.println(" Apartment Location is :"+look.apartmentLocation);
System.out.println(" Number of floors available in Apartment are:"+look.apartmentFloors);
System.out.println(" Number of 2BHK Flats available are: "+look.noOf2BHKflats);
System.out.println(" Number of 3BHK Flats available are: "+look.noOf3BHKflats);
System.out.println("                     ");


Apartment looking = new Apartment();
looking.apartmentID = 2;
looking.apartmentName = "MOGO";
looking.apartmentLocation ="JayaNagar";
looking.apartmentFloors = 50;
looking.noOf2BHKflats = 100;
looking.noOf3BHKflats = 50;

looking.accomadation();
System.out.println(" Apartment id is :"+looking.apartmentID);
System.out.println(" Apartment Name is :"+looking.apartmentName);
System.out.println(" Apartment Location is :" +looking.apartmentLocation);
System.out.println(" Number of floors available in Apartment are :"+looking.apartmentFloors);
System.out.println(" Number of 2BHK Flats available are :"+looking.noOf2BHKflats);
System.out.println(" Number of 3BHK Flats available are :"+looking.noOf3BHKflats);
System.out.println("                     ");

Apartment see = new Apartment();
see.apartmentID = 3;
see.apartmentName = "POGO";
see.apartmentLocation = "GandhiNagar";
see.apartmentFloors = 70;
see.noOf2BHKflats =140;
see.noOf3BHKflats =070;

see.accomadation();
System.out.println(" Apartment id is :"+ see.apartmentID);
System.out.println(" Apartment Name is :"+see.apartmentName);
System.out.println(" Apartment Location is :"+see.apartmentLocation);
System.out.println(" Number of Floors available are :"+see.apartmentFloors);
System.out.println(" Number of 2BHK Flats available are :"+see.noOf2BHKflats);
System.out.println(" Number of 3BHK Flats available are:"+see.noOf3BHKflats);


}


}