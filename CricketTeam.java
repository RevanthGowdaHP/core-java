class CricketTeam{
String playerNames[] = new String[10];
int index;

public boolean addPlayerNames(String playername){
   boolean isAdded = false;
   if( playername != null){
      playerNames[index] = playername;
	  isAdded = true;
	  index++;
   
   }
   else{
   System.out.println(" New playerNames not added");
   }
   return isAdded;
}

public void getPlayerName(){

   System.out.println("New playerNames added are :");
   for(index = 0 ; index<playerNames.length ; index++){
    System.out.println("                     "+playerNames[index]);
   }
}


}