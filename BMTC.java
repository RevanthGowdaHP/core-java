class BMTC{

int busID ;
String busStopName;
String busName;
int noOfSeats;
int ticketPrice;

public BMTC(){
	this(1,"VijayaNagar","401R",30,15);
}
public BMTC(int busID, String busStopName , String busName , int noOfSeats , int ticketPrice){

this.busID = busID;
this.busStopName = busStopName;
this.busName = busName;
this.noOfSeats =noOfSeats;
this.ticketPrice = ticketPrice;
displayDetails();




}
public void  displayDetails(){

System.out.println("Bus ID of the BMTC:"+this.busID);
System.out.println("Bus Stop Name of the BMTC:"+this.busStopName);
System.out.println("Bus Name :"+this.busName);
System.out.println("Number of noOfSeats available:"+this.noOfSeats);
System.out.println(" TicketPrice is:RS "+this.ticketPrice);



}
}