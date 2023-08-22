class ArrayExample {
static String fruits[] = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
    

public static void main(String[] args) {
	 
        String firstFruit = getElement(fruits,0); //fruits[] = frts[]
        String thirdFruit = getElement(fruits,2); 

        System.out.println("First fruit: " + firstFruit);
        System.out.println("Third fruit: " + thirdFruit);
    }
	
	   public static String getElement(String frts[], int idex) {
       
	   
        for (int io = idex ; io <= frts.length;io++) {
            return frts[io];
        } 
        return "nothing";
    }
}
