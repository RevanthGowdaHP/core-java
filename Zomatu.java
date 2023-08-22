import java.util.HashMap;
class Zomatu{
  public static void search(String nameOfFood) {
    
    HashMap<String, Integer> foodPrices =  new HashMap<String,Integer>();
System.out.println("count1");
    
    foodPrices.put("Pizza", 249);
    foodPrices.put("Bruger", 90);
    foodPrices.put("Briyani", 280);
   

    
    if (foodPrices.containsKey(nameOfFood)) {
      
      int price = foodPrices.get(nameOfFood);
 
 
 System.out.println("count2");
         
      System.out.println("Price of the " + nameOfFood + " is :" + price);
    } else {
      // Print a message if the nameOfFood is not in the foodPrices hash map
      System.out.println("Sorry, we don't have " + nameOfFood + " in our menu.");
    }

System.out.println("count3");
    
  }}