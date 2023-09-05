class Library{

int libraryID;
int noOfLibrarian;
String categories[]  = {"Engineering","Politics","Geograpy","Novels","Dictionary"};
int noOfSeats;
String type;


public Library(){
	this(1,4,new String[]{"Engineering","Politics","Geograpy","Novels","Dictionary"},20,"Public Library");
	System.out.println("default constructor");
}
public Library(int libraryID, int noOfLibrarian , String categories[] , int noOfSeats , String type){

this.libraryID = libraryID;
this.noOfLibrarian = noOfLibrarian;
this.categories = categories;
this.noOfSeats =noOfSeats;
this.type = type;
displayDetails();




}
public void read()
{
	for(int book =0 ; book<categories.length ;book++)
	{
System.out.println("Books Categories available are :"+categories[book]);
}



}
public void displayDetails(){

System.out.println("Library ID :"+this.libraryID);
System.out.println("Number of Librarians : "+this.noOfLibrarian);
System.out.println("Number of seats in Library :"+this.noOfSeats);
System.out.println("Type of Library : "+this.type);



}
}