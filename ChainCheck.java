class ChainCheck{
public static void main(String cha[]){

Chain nice = new Chain();

nice.name= "Kalyan";
nice.type = "Gold";
nice.grams = 50;
nice.carat = 24;
nice.wastage = 4.00F;
nice.tax = 12.00F;

nice.put();
System.out.println(" Brand name :"+ nice.name);
System.out.println(" Type of Chain :"+nice.type);
System.out.println(" Number of Grams :"+nice.grams);
System.out.println(" Number of Carat :"+ nice.carat);
System.out.println("Wastage is :"+ nice.wastage);
System.out.println(" Tax on Chain :"+nice.tax);
System.out.println("                     ");

Chain good= new Chain();

good.name= "Malbar";
good.type = "Silver";
good.grams = 100;
good.carat = 24;
good.wastage = 2.00F;
good.tax =8.00F;

good.put();
System.out.println(" Brand name :"+ good.name);
System.out.println(" Type of Chain :"+good.type);
System.out.println(" Number of Grams :"+good.grams);
System.out.println(" Number of Carat :"+ good.carat);
System.out.println(" Wastage is :"+ good.wastage);
System.out.println(" Tax on Chain :"+good.tax);
System.out.println("                     ");














}



}