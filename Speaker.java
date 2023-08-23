class Speaker{

static boolean isConnected;
static int maxVolume = 5;
static int minVolume ;
static int currentVolume ;

public static boolean onOrOff(){

if( isConnected == false){
	isConnected =true;
System.out.println("The speaker is Turned ON");

}
else if(isConnected == true){
isConnected = false;
System.out.println("The speaker is Turned OFF");
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
			
			System.out.println(" Saaku bidu guru Full volume nalle ede ");
		}
	}
	else{
		
		System.out.println(" Bro kya he tu . Kaha se aaya he pehle speaker to ON kar");
	}
	
	
}

public static void minVolume(){
	
	if(isConnected == true){
		if( currentVolume > minVolume){
			
			currentVolume --;
			System.out.println(" The current volume is :"+currentVolume);
		}
		else{
			System.out.println(" Bhai yenu kelusthilla thane , Mathe decrease button yaake press maadthidya");
			
		}
		
	}
	else{
		System.out.println(" Beta rehne de tum se na ho payega");
	}
	
}

}