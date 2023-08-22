class UberEatsUser{
public static void main(String uber[]){

double amount = UberEats.search("Quinoa salad");
System.out.println("price of the Quinoa salad :"+amount);
double quantityAmount = UberEats.search("Quinoa salad",6);
System.out.println("Price of the Quinoa salad with Quanitity ="+quantityAmount);

}
}