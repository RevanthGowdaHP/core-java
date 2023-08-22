class SwiggyUser{
public static void main(String swig[]){

double amount = Swiggy.search("Cheeseburger");
System.out.println("price of the Cheeseburger :"+amount);
double quantityAmount = Swiggy.search("Cheeseburger",4);
System.out.println("Price of the Cheeseburger with Quanitity ="+quantityAmount);

}
}