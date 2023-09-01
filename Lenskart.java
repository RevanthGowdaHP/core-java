class Lenskart{

String brandName ;
int brandID ;
String frames;
int noOfBrands ;
float minPrice;
float maxPrice;

public Lenskart(String bName,int id,String frame , int brands , float min , float max){
	brandName = bName;
	brandID = id;
	frames = frame;
	noOfBrands = brands;
	minPrice = min;
	maxPrice = max;
	System.out.println("Object created for Lenskart");
	
	
}



public void product(){

System.out.println(" These are the products available in this Brand ");
System.out.println(" Brand Name :"+brandName);
System.out.println(" Brand ID :"+brandID);
System.out.println(" Frames available are :"+frames);
System.out.println(" Number of Brands :"+noOfBrands);
System.out.println(" Minimum price of frame :"+minPrice);
System.out.println(" Maximum price of frame :"+maxPrice);
System.out.println("                     ");
}



}