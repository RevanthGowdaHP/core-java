class Metro{
	
 int metroID;
 int noOfCompartments;
 String source;
 String destination;


public Metro(int metroID,int noOfCompartments, String source , String destination){

this.metroID=metroID;
this.noOfCompartments = noOfCompartments;
this.source = source;
this.destination = destination;

}
public void details(){
System.out.println("The metro ID is :"+metroID);
System.out.println("The Number of compartments :"+noOfCompartments);
System.out.println("Source:"+source);
System.out.println(" Destination:"+destination);


}}