class LenskartView{

public static void main(String arg[]){

Lenskart lens = new Lenskart();

lens.brandName = "Lenskart";
lens.brandID = 9834;
lens.frames ="box";
lens.noOfBrands = 64;
lens.minPrice = 500.00F;
lens.maxPrice = 7000.00f;

lens.product();
System.out.println(" Brand Name :"+lens.brandName);
System.out.println(" Brand ID :"+lens.brandID);

System.out.println(" Frames available are :"+lens.frames);

System.out.println(" Number of Brands :"+lens.noOfBrands);
System.out.println(" Minimum price of frame :"+lens.minPrice);
System.out.println(" Maximum price of frame :"+lens.maxPrice);
System.out.println("                     ");


Lenskart piush = new Lenskart();

piush.brandName = " Specskart";
piush.brandID = 5324;
piush.frames =" triangle";
piush.noOfBrands = 43;
piush.minPrice = 300.00F;
piush.maxPrice = 4000.00F;

piush.product();
System.out.println(" Brand Name :"+piush.brandName);
System.out.println(" Brand ID :"+piush.brandID);

System.out.println(" Frames available are :"+piush.frames);
System.out.println(" Number of Brands :"+piush.noOfBrands);
System.out.println(" Minimum price of frame :"+piush.minPrice);
System.out.println(" Maximum price of frame :"+piush.maxPrice);
System.out.println("                     ");












}




}