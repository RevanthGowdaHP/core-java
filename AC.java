class AC{

static boolean isstatus;
static int maxTemp = 28;
static int minTemp ;
static int currentTemp;
public static boolean power(){

if( isstatus == false){
 isstatus = true;
 System.out.println(" AC is turned ON");
}
else if( isstatus == true){
isstatus = false;
 System.out.println(" AC is turned OFF");
}
return isstatus;
}
public static void temperatureUP(){

if( isstatus == true){
  if( currentTemp < maxTemp){
     currentTemp++;
	 System.out.println("Current Temperature is : "+currentTemp);
   } 
  else{
        System.out.println("Maximum Temperature is reached");
		}
   }
else{
    
	System.out.println("BETA TUM SE NA HO PAYEGA");


}


}
public static void temperatureDown(){
if(isstatus == true){
if(currentTemp > minTemp){
 currentTemp--;
 System.out.println(" Current Temperature is :"+currentTemp);

}
else{
System.out.println(" Minimum Temperature is Reached ");
}

}
else{
System.out.println(" OOO BHAI MAARO MUJE MAARO , NAHI YAHA PAR KYA HORAHA HE");
}
}

}