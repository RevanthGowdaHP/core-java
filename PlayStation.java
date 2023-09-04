class PlayStation{

int id;
int noOfGames;
String typesOfGames[];
int startTime;
int endTime;

public PlayStation(int id, int noOfGames , String typesOfGames[] , int startTime , int endTime){

this.id = id;
this.noOfGames = noOfGames;
this.typesOfGames = typesOfGames;
this.startTime =startTime;
this.endTime = endTime;
displayDetails();




}
public void xBOX()
{
	for(int box =0 ; box<typesOfGames.length ;box++)
	{
System.out.println("Types Of Games in PlayStation :"+typesOfGames[box]);
}



}
public void  displayDetails(){

System.out.println("PlayStation ID :"+id);
System.out.println("Number of games in PlayStation:"+noOfGames);
System.out.println("Start Time of PlayStation:"+startTime+"am");
System.out.println("End Time of PlayStation : "+endTime+"pm");



}
}