class Fastrack{

String name ;
String type ;
int collection ;
int minPrice ;
int maxPrice ;

public Fastrack(String naam , String types ,int collect , int min , int max)
{
	name = naam ;
	type = types;
	collection = collect;
	minPrice = min;
	maxPrice = max;
	System.out.println("Object created for Fastrack using Constructor");
	
	
}
public void product(){
System.out.println(" The products are ");
System.out.println(" Name of the Brand: "+name);
System.out.println(" Type of Product :"+type);
System.out.println(" Number of Collection available are :"+collection);
System.out.println(" Minimum Price for a Single Watch is : Rs "+minPrice);
System.out.println(" Maximum PRice for a Single Watch is : Rs "+maxPrice);
System.out.println("                     ");
}


}