class Hotel{
String menus[] = new String[10];
int index;

public boolean addMenu(String menu){
   boolean isAdded = false;
   if( Menu != null){
      menus[index] = menu;
	  isAdded = true;
	  index++;
   
   }
   else{
   System.out.println(" New menu not added");
   }
   return isAdded;
}

public void getMenu(){

   System.out.println("New menu added are :");
   for(index = 0 ; index<menus.length ; index++){
    System.out.println("                       "+menus[index]);
   }
}


}