class Airport{

int id;
String location;
String name;
int terminals;
int planes;

public Airport(int id, String location , String name , int terminals , int planes){

this.id = id;
this.location = location;
this.name = name;
this.terminals =terminals;
this.planes = planes;
displayDetails();




}
public void displayDetails(){

System.out.println("Id of the Airport:"+id);
System.out.println("Location of the Airport:"+location);
System.out.println("Name of the Airport:"+name);
System.out.println("Number of terminals:"+terminals);
System.out.println("Number of planes available:"+planes);



}
}