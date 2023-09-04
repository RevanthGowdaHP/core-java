class Library{

int libraryID;
int noOfLibrarian;
String categories[];
int noOfSeats;
String type;

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

System.out.println("Library ID :"+libraryID);
System.out.println("Number of Librarians : "+noOfLibrarian);
System.out.println("Number of seats in Library :"+noOfSeats);
System.out.println("Type of Library : "+type);



}
}