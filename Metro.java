class Metro{
	
 int metroID;
 int noOfCompartments;
 String source;
 String destination;

public Metro(){
	this(1,10,"Vijanagar","Majestic");
}

public Metro(int metroID,int noOfCompartments, String source , String destination){

this.metroID=metroID;
this.noOfCompartments = noOfCompartments;
this.source = source;
this.destination = destination;

}
public void details(){
System.out.println("The metro ID is :"+this.metroID);
System.out.println("The Number of compartments :"+this.noOfCompartments);
System.out.println("Source:"+this.source);
System.out.println(" Destination:"+this.destination);


}}