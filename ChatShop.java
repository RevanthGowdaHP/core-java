class ChatShop{
String chatNames[] = new String[10];
int index;

public boolean addchatName(String chatName){
   boolean isAdded = false;
   if( chatName != null){
      chatNames[index] = chatName;
	  isAdded = true;
	  index++;
   
   }
   else{
   System.out.println(" New chatNames not added");
   }
   return isAdded;
}

public void getchatName(){

   System.out.println("New chatNames added are :");
   for(index = 0 ; index<chatNames.length ; index++){
    System.out.println("                       "+chatNames[index]);
   }
}


}