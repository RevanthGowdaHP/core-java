class FAN{

static int maxSpeed = 5;
static int minSpeed;
static int presentSpeed; 
static boolean istoggle;
public static boolean Switch()
{
  if( istoggle == false)
     {
       istoggle = true;
       System.out.println(" Fan is turned ON");
   }
  else if( istoggle == true)
  {
   istoggle = false;
   System.out.println(" Fan is turned OFF");
}
return istoggle;
}

public static void rotateRight(){
if(istoggle ==true){
if(presentSpeed < maxSpeed){
 presentSpeed++;
 System.out.println("Speed is :"+presentSpeed);
}
else{
  System.out.println(" Full speed tuntuntun");
}

}
else{
System.out.println(" Toggle switch is off");
}


}

public static void rotateLeft(){
if(istoggle ==true){
if(presentSpeed >minSpeed){
 presentSpeed--;
 System.out.println("Speed is :"+presentSpeed);
}
else{
  System.out.println(" Gaali barthilla");
}

}
else{
System.out.println("Fan off aagide Guru, First ON maadu" );
}


}}