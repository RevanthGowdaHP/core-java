class EatSureUser{
public static void main(String eat[]){

double amount = EatSure.search("Ratatouille");
System.out.println("price of the Ratatouille :"+amount);
double quantityAmount = EatSure.search("Ratatouille",8);
System.out.println("Price of the Ratatouille with Quanitity ="+quantityAmount);
}
}