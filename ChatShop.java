class ChatShop{
String chatNames[] = new String[10];
int index;

public boolean addchatName(String chatName){
   boolean isAdded = false;
   if(index < chatNames.length){
	   
	    if( chatName != null){
			boolean exists = checkDuplicate(chatName);
			if(exists == false){
				chatNames[index] = chatName;
				isAdded = true;
				index++;
                  }
				 
			  }
			   else{
			   System.out.println("New chatNames not added");
				 }
	}
  else{
	  System.out.println("Chat names exceede.");
  }
   return isAdded;
}


public void getchatName(){
 System.out.println("New chatNames added are :");
   for(index = 0 ; index<chatNames.length ; index++){
    System.out.println("                   "+chatNames[index]);
   }
}
public boolean checkDuplicate(String chatName){
	boolean exists = false;
	for(int num = 0 ; num< chatNames.length ; num++){
		if( chatNames[num] == chatName){
			exists = true;
		  System.out.println("'"+chatName+"' already exist. Please add new ChatName");
		}
		
	}   
	return exists;
	
}

}