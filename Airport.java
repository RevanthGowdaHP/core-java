class Airport{

int id;
String location;
String name;
int terminals;
int planes;

public Airport(){
	this(1,"Banglore","KempeGowda",4,25);
}
public Airport(int id, String location , String name , int terminals , int planes){

this.id = id;
this.location = location;
this.name = name;
this.terminals =terminals;
this.planes = planes;
displayDetails();




}
public void displayDetails(){

System.out.println("Id of the Airport:"+this.id);
System.out.println("Location of the Airport:"+this.location);
System.out.println("Name of the Airport:"+this.name);
System.out.println("Number of terminals:"+this.terminals);
System.out.println("Number of planes available:"+this.planes);



}
}