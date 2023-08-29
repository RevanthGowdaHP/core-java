class SensorTest{

public static void main(String srn[]){

Sensor det = new Sensor();

det.brandName = "ABB";
det.sensorNoTag = 624;
det.sensorType = "termo";
det.function = "Measure Temperature";
det.capacity = 100;
det.power = 66;

det.detect();

System.out.println(" Brand Name :"+det.brandName);
System.out.println(" Sensor Tag Number is :"+det.sensorNoTag);
System.out.println(" Type of Sensor:"+ det.sensorType);
System.out.println(" Functionality is :"+det.function);
System.out.println(" Capacity of withstand :"+ det.capacity+"celsius");
System.out.println(" Power Required :"+det.power+"volts");
System.out.println("                     ");
System.out.println("                     ");

Sensor set = new Sensor();

set.brandName = "Seimens";
set.sensorNoTag = 985;
set.sensorType = "motor";
set.function = "Rotate";
set.capacity = 320;
set.power = 240;

set.detect();

System.out.println(" Brand Name :"+set.brandName);
System.out.println(" Sensor Tag Number is :"+set.sensorNoTag);
System.out.println(" Type of Sensor:"+ set.sensorType);
System.out.println(" Functionality is :"+set.function);
System.out.println(" Capacity of withstand :"+ set.capacity+"rpm");
System.out.println(" Power Required :"+set.power+" volts");
System.out.println("                     ");
System.out.println("                     ");




















}




}