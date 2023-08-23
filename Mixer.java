class Mixer{
static boolean isPower ;

static int maxSpeed =3;
static int minSpeed ;
static int currentSpeed ; 

public static boolean button(){

if( isPower == false){
  
  isPower = true;
 
    System.out.println(" Mixer is turned ON");
}
   else if( isPower == true){
   isPower = false;


 System.out.println(" Mixer is turned OFF");
}
return isPower;

}

public static int knobToRight(){
if( isPower == true){
  if( currentSpeed < maxSpeed){
  currentSpeed++;
  System.out.println(" Speed of the mixer is :"+ currentSpeed);

}
else{
System.out.println(" Full speed ");
}
}
else{
System.out.println(" Please turn ON the Mixer");
}
return currentSpeed;

}

public static int knobToleft(){
if( isPower == true){
  if( currentSpeed >minSpeed){
  currentSpeed--;
  System.out.println(" Speed of the mixer is :"+ currentSpeed);

}
else{
System.out.println("Low speed ");
}
}
else{
System.out.println(" Please turn ON the Mixer");
}
return currentSpeed;

}

}