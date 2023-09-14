class Spotify{
String musics[] = new String[10];
int index;

public boolean addMusic(String music){
   boolean isAdded = false;
   if( music != null){
      musics[index] = music;
	  isAdded = true;
	  index++;
   
   }
   else{
   System.out.println(" New musics not added");
   }
   return isAdded;
}

public void getMusic(){

   System.out.println("New musics added are :");
   for(index = 0 ; index<musics.length ; index++){
    System.out.println("                     "+musics[index]);
   }
}


}