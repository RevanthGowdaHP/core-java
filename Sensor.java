class Sensor
{

String brandName ;
int sensorNoTag;
String sensorType;
String function;
int capacity;
int power;

public Sensor(String bName, int tag, String type , String functions ,int cap , int pow){
	brandName =bName;
	sensorNoTag= tag;
	sensorType = type;
	function = functions;
	capacity = cap;
	power  = pow;
	System.out.println("Object created for Sensor using Constructor");
	
}



public void detect(){
System.out.println(" The Sensor Detects the defect ");
System.out.println(" Brand Name :"+brandName);
System.out.println(" Sensor Tag Number is :"+sensorNoTag);
System.out.println(" Type of Sensor:"+ sensorType);
System.out.println(" Functionality is :"+function);
System.out.println(" Capacity of withstand :"+ capacity+"celsius");
System.out.println(" Power Required :"+power+"volts");
System.out.println("                     ");
System.out.println("                     ");

}



}