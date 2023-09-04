class Udhyanavana{

int id;
int noOfGates;
String flowers[];
int startTime;
int endTime;

public Udhyanavana(int id, int noOfGates , String flowers[] , int startTime , int endTime){

this.id = id;
this.noOfGates = noOfGates;
this.flowers = flowers;
this.startTime =startTime;
this.endTime = endTime;
displayDetails();




}
public void huuvu()
{
	for(int flo =0 ; flo<flowers.length ;flo++)
	{
System.out.println("Flowers in Udhyanavana :"+flowers[flo]);
}



}
public void  displayDetails(){

System.out.println("Udhyanavana ID :"+id);
System.out.println("Number of gates in Udhyanavana:"+noOfGates);
System.out.println("Start Time of Udhyanavana:"+startTime+"am");
System.out.println("End Time of Udhyanavana : "+endTime+"pm");



}
}