class SensorTest{

public static void main(String srn[]){

Sensor det = new Sensor("ABB",623,"termo","Measure Temperature",100,66);
det.detect();

Sensor set = new Sensor("Seimens",985,"motor","Rotate",320,240);
set.detect();
}




}