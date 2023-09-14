class CricketTeam{
String playerNames[] = new String[11];
int index;

public boolean addPlayerNames(String playername){
   boolean isAdded = false;
   if(index < playerNames.length){
	   if( playername != null){
		   boolean cric = checkForDuplicate(playername);
		   if(cric == false){
      playerNames[index] = playername;
	  isAdded = true;
	  index++;
		   }
   }
   else{
   System.out.println(" New playerNames not added");
   }
   }
   else{
	   System.out.println("Number of playerNames exceeded. So names cannot be added");
   }
   
   return isAdded;
}

public void getPlayerName(){

   System.out.println("New playerNames added are :");
   for(index = 0 ; index<playerNames.length ; index++){
    System.out.println("                     "+playerNames[index]);
   }
}
public boolean checkForDuplicate(String playername){
	boolean check = false;
	for(int pla = 0 ; pla<playerNames.length; pla++){
		if(playerNames[pla] == playername){
			check = true;
			System.out.println("'"+playername+"' name already exist");
		}
	}
	return check;
}

}