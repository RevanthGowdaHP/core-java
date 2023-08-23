class WashingMachine{


static String mode[] ={"Wool","Cotton","SoprtsWear"};
static int maxSpeed = 20;
static int minSpeed ;
static int speed1;
static int speed2;
static int speed3;
static boolean isPower;

 public static boolean button(){

if( isPower == false){
 isPower = true;
 System.out.println(" Washing Machine is turned ON");
}
else if( isPower == true){
isPower = false;
 System.out.println(" Washing Machine is turned OFF");
}
return isPower;

}

public static void increaseSpeed(){
if(isPower ==true){
for(int mod = 0 ; mod<mode.length ; mod++){
   if(mode[mod] == "Wool"){
      if(speed1 < maxSpeed){
	    speed1 = speed1 +1;
		System.out.println(" Speed of WashingMachine in Wool mode is :"+speed1);
	  }
	  else{
	  System.out.println("Maximum speed reached");
	  }
	  }
	  
  else if(mode[mod] == "Cotton"){
      if(speed2 < maxSpeed){
	    speed2 = speed2 +2;
		System.out.println(" Speed of WashingMachine in  Cotton mode is :"+speed2);
   
   }
   else{
	  System.out.println("Maximum speed reached");
	  }}
 else if(mode[mod] == "SoprtsWear"){
      if(speed3 < maxSpeed){
	    speed3 = speed3 +3;
		System.out.println(" Speed of WashingMachine in SoprtsWear mode is :"+speed3);
   
   }
   else{
	  System.out.println("Maximum speed reached");
	  }}
   
continue;}

}
else{
  System.out.println("Please turn ON");
}

}


public static void decreaseSpeed(){
if(isPower ==true){
for(int mod = 0 ; mod<mode.length ; mod++){
   if(mode[mod] == "Wool"){
      if(speed1 > minSpeed){
	    speed1 = speed1 -1;
		System.out.println(" Speed of WashingMachine in Wool mode is :"+speed1);
	  }
	  else{
	  System.out.println("Minimum speed reached");
	  }
	  }
	  
  else if(mode[mod] == "Cotton"){
      if(speed2 > minSpeed){
	    speed2 = speed2 -2;
		System.out.println(" Speed of WashingMachine in  Cotton mode is :"+speed2);
   
   }
   else{
	  System.out.println("Minimum speed reached");
	  }}
 else if(mode[mod] == "SoprtsWear"){
      if(speed3 > minSpeed){
	    speed3 = speed3 -3;
		System.out.println(" Speed of WashingMachine in SoprtsWear mode is :"+speed3);
   
   }
   else{
	  System.out.println("Minimum speed reached");
	  }}
   
continue;}

}
else{
  System.out.println("Please turn ON");
}

}





}