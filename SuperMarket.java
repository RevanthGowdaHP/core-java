class SuperMarket{
	
 static String chocolates[] ={"Perk","DairyMilk","5-Star","TicTak","JustJelly","Amul DarkChocolate","Munch","Pusle","LoliPop","MilkyBar","KitKat","Cadbury","Marbles","Gems","Ferrero Rocher"};
 static String biscuits[] ={"Marigold","JimJam","BurBon","Hide&Seek","Treat","50/50","Rusk","Oreo","Bounce","Nutrichoice","Parle-G","Happy Happy","GoodDay","Unibic","Monaco"};
 static String soaps[] ={"Hamam","Lux","Santoor","Dove","Pears","LifeBoy","MysoreSandal","Himalaya","Cinthol","Dettol","Patanhali","Nivea","Medimix","Liril","Vivel","JhonsonsBaby"};
 static String vegetables[] = {"Carrot","Brinjal","Tomato","potato","onion","DrumStick","LadyFinger","Cabbage","CauliFlower","Raddish","BitterGourd","Broccli","pumpkin","Mushroom","Capsicum","Beetroot","Corn","Spinac"};
 static String perfumes[] = {"Chanel","Calvin Klein","Burberry","Versace","Hugo Boss","Lancome","Jimmy Choo","Armani","Tommy Hilfiger","Fog","Axe","Denver","Bloom","Allure","Breeze","Summer Rain","Secrect Wish"};
 static String snacks[] = {"Lays","Kurkure","Nanmkeen","too Yum","karare","HaldiRams","Popcorn","Potato chips","Bingo","Doritos","Cheetos","Maggi","yeppi","Ketchap","Candys","Jolo Chips"};
 static String fruits[] ={"Apples","Avacados","Bananas","Berries","Cherris","Grapes","Kiwi","Lemons","Lime","Melons","Oranges","Peaches","Pears","Plums","GrapeFruits","Nectaines"};
 static String dairy[] = {"Bread","Bangels","Cake","Croissants","Cookies","Donuts","Hambergers","Hot dogs buns","Muffins","Pita Bread","Tortillas","wraps","VegRolls","Chocobun","Egg puffs","Coconut Biscuits","waffers"};
 static String meatAndFish[] = {"Bacon","Burgers","chicken","cod","Deli meat","Ground beef","Ham","Hot dogs","Salmon","Sausages","Steak","Tuna","Turkey","Kaima Balls","liver","Eggs"};
 static String saucesAndCondiments[] = {"BBQ sauce","Chutney","Coconut oil","Honey","Horseradish","Hot sauce","Lemon juice","Mayonnaise","Mustard","Olive Oil","Relish","Rice Brain oil","Salsa","Soy sauce","Teriyaki","Vinegar"};
 static String herbsAndSpices[] = {"Basil","Bay leaves","Black Pepper","Cinnamon","Cloves","Cumin","Curry Powder","Coriander Powder","Curry powder","Garlic powder","Salt","Red pepper","Oregano"};
  
  
  public static void main(String args[]){
  
  getchocolates(chocolates);
  System.out.println("..........................");
  getbiscuits(biscuits);
   System.out.println("..........................");
  getdairy(dairy);
   System.out.println("..........................");
  getfruits(fruits);
   System.out.println("..........................");
  getherbsAndSpices(herbsAndSpices);
   System.out.println("..........................");
  getmeatAndFish(meatAndFish);
   System.out.println("..........................");
  getperfumes(perfumes);
   System.out.println("..........................");
  getsaucesAndCondiments(saucesAndCondiments);
   System.out.println("..........................");
  getsnacks(snacks);
   System.out.println("..........................");
  getsoaps(soaps);
   System.out.println("..........................");
  getvegetables(vegetables);
   System.out.println("..........................");
  
  
  }

public static void getchocolates(String bro[]){
System.out.println("The Chocolates available are:");
for(int yo = 0; yo<chocolates.length ; yo++){ // chcocolates[]= bro[]

    System.out.println("                               "+chocolates[yo]);
}
for(int rev= chocolates.length-1 ; rev >=0 ; rev--){
	System.out.println(chocolates[rev]);
}
}

public static void getbiscuits(String[] biscuits){
System.out.println("The Biscuits available are:" );
for(int so = 0; so<biscuits.length ; so++){

System.out.println("                               "+biscuits[so]);
      }
}

public static void getsoaps(String soaps[])
{
System.out.println(" The soaps available are:");
for(int ao = 0; ao<soaps.length ; ao++)
{

System.out.println("                              "+soaps[ao]);
  }
}

public static void getvegetables(String[] vegetables)
{
System.out.println(" The vegetables available are:" );
for(int bo = 0; bo<vegetables.length ; bo++)
   {

System.out.println("                                "+vegetables[bo]);
       }
}

public static void getperfumes(String perfumes[])
{
System.out.println(" The perfumes available are:" );
for(int co = 0; co<perfumes.length ; co++)
   {

System.out.println("                                "+perfumes[co]);
   }
}

public static void getsnacks(String snacks[])
{
System.out.println(" The snacks available are:");
for(int vo = 0; vo<snacks.length ; vo++)
    {

System.out.println("                               "+snacks[vo]);
    }
}

public static void getfruits(String[] fruits)
{
System.out.println(" The fruits available are:" );
for(int wo = 0; wo<fruits.length ; wo++)
     {

System.out.println("                                "+fruits[wo]);
     }
}

public static void getdairy(String[] dairy)
{
System.out.println(" The dairy available are:" );
for(int eo = 0; eo<dairy.length ; eo++)
    {

System.out.println("                                "+dairy[eo]);
    }
}

public static void getmeatAndFish(String[] meatAndFish)
    {
System.out.println(" The meatAndFish available are:");
for(int qo = 0; qo<meatAndFish.length ; qo++)
    {

System.out.println("                               "+meatAndFish[qo]);
     }
}

public static void getsaucesAndCondiments(String[] saucesAndCondiments)
{
System.out.println(" The saucesAndCondiments available are:" );
for(int ro = 0; ro<saucesAndCondiments.length ; ro++)
   {

System.out.println("                               "+saucesAndCondiments[ro]);
   }
}

public static void getherbsAndSpices(String[] herbsAndSpices)
{
System.out.println(" The herbsAndSpices available are:" );
for(int io = 0; io<herbsAndSpices.length ; io++)
     {

System.out.println("                               "+herbsAndSpices[io]);
     }
}

}