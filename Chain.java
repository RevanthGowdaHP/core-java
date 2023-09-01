class Chain{
String name;
String type;
int grams ;
int carat;
float wastage;
float tax;


public Chain(String naam , String types , int gram , int carats , float wastages , float taxz){
	name = naam;
	type = types;
	gram = grams;
	carat = carats;
	wastage = wastages;
	tax = taxz;
	System.out.println("Object for Chain is created using constructor");
	
	
	
}

public void put(){
System.out.println(" Type of Chain");
System.out.println(" Brand name :"+ name);
System.out.println(" Type of Chain :"+type);
System.out.println(" Number of Grams :"+grams);
System.out.println(" Number of Carat :"+ carat);
System.out.println(" Wastage is :"+ wastage);
System.out.println(" Tax on Chain :"+tax);
System.out.println("                     ");
}



}