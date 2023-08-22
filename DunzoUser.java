class DunzoUser{
public static void main(String dunzo[]){

double amount = Dunzo.search("Gourmet vegan coconut curry tofu");
System.out.println("price of the Gourmet vegan coconut curry tofu :"+amount);
double quantityAmount = Dunzo.search("Gourmet vegan coconut curry tofu",6);
System.out.println("Price of the Gourmet vegan coconut curry tofu with Quanitity ="+quantityAmount);
}
}