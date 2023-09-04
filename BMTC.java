class BMTC{

int busID ;
String busStopName;
String busName;
int noOfSeats;
int ticketPrice;

public BMTC(int busID, String busStopName , String busName , int noOfSeats , int ticketPrice){

this.busID = busID;
this.busStopName = busStopName;
this.busName = busName;
this.noOfSeats =noOfSeats;
this.ticketPrice = ticketPrice;
displayDetails();




}
public void  displayDetails(){

System.out.println("Bus ID of the BMTC:"+busID);
System.out.println("Bus Stop Name of the BMTC:"+busStopName);
System.out.println("Bus Name :"+busName);
System.out.println("Number of noOfSeats available:"+noOfSeats);
System.out.println(" TicketPrice is:RS "+ticketPrice);



}
}