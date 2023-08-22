class ZomatoUser{
public static void main(String zoma[]){

double amount = Zomato.search("Pizza");
System.out.println("price of the Pizza "+"Rs :"+amount);
 double quantityAmount = Zomato.search("Pizza",5);
System.out.println("Price of the Pizza with Quanitity ="+quantityAmount);
 

}
}