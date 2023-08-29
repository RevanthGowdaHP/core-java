
class FastrackPro{

public static void main(String pro[]){

Fastrack yo = new Fastrack();
yo.name = "Fastrack";
yo.type = "Watch";
yo.collection = 670;
yo.minPrice = 500;
yo.maxPrice = 8000;

yo.product();
System.out.println(" Name of the Brand: "+yo.name);
System.out.println(" Type of Product :"+yo.type);
System.out.println(" Number of Collection available are :"+yo.collection);
System.out.println(" Minimum Price for a Single Watch is : Rs "+yo.minPrice);
System.out.println(" Maximum PRice for a Single Watch is : Rs "+yo.maxPrice);
System.out.println("                     ");

Fastrack bro = new Fastrack();
bro.name = "Fastrack";
bro.type = "Glass";
bro.collection = 2070;
bro.minPrice = 750;
bro.maxPrice = 23000;

yo.product();
System.out.println(" Name of the Brand: "+bro.name);
System.out.println(" Type of Product :"+bro.type);
System.out.println(" Number of Collection available are :"+bro.collection);
System.out.println(" Minimum Price for a Single Glass is : Rs "+yo.maxPrice);
System.out.println(" Maximum PRice for a Single Glass is :Rs "+yo.maxPrice);
System.out.println("                     ");















}











}