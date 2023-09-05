class Gym{

int id;
int price;
String typesOfEquipment[] ;
int startTime;
int endTime;

public Gym(){
	this(1,1000,new String[]{"Dumbell","Rowing Machine","Kettlebell","Machine fly","Dip Bar"},5,11);
}
public Gym(int id, int price , String typesOfEquipment[] , int startTime , int endTime){

this.id = id;
this.price = price;
this.typesOfEquipment = typesOfEquipment;
this.startTime =startTime;
this.endTime = endTime;
displayDetails();




}
public void flex()
{
	for(int lats =0 ; lats<typesOfEquipment.length ;lats++)
	{
System.out.println("Types Of Equipment in Gym :"+typesOfEquipment[lats]);
}



}
public void  displayDetails(){

System.out.println("Gym ID :"+this.id);
System.out.println("Gym price for Month:Rs "+this.price);
System.out.println("Start Time of Gym:"+this.startTime+"am");
System.out.println("End Time of Gym : "+this.endTime+"pm");



}
}
