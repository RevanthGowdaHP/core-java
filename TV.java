class TV{

static boolean isConnected;
static int maxVolume = 8;
static int minVolume ;
static int currentVolume ;

public static boolean power(){
if( isConnected == false){
	isConnected =true;
System.out.println("The TV is Switched ON");
}
else if(isConnected == true){
isConnected = false;
System.out.println("The TV is Switched OFF");
}
return isConnected;

}

public static void maxVolume(){
	
  if(isConnected == true){
	if( currentVolume < maxVolume){
		currentVolume++;
		 System.out.println("The current volume is : "+currentVolume);
			}
		else{
	System.out.println(" MAX VOLUME 	");
	}
  }
	else{
		System.out.println(" TV is OFF");
	}
	
	
}

public static void minVolume(){
	if(isConnected == true){
	  if( currentVolume > minVolume){
		currentVolume --;
		  System.out.println(" The current volume is :"+currentVolume);
		}
	  else{
		System.out.println(" MIM VOLUME");
		}
      }
    else{
		System.out.println(" PLEASE Switch ON TV");
	}
	
}

	
}




