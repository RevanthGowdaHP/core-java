class MixerTesting{

public static void main(String arg[]){

Mixer.button();
int speed = Mixer.knobToRight();
System.out.println(" Right Knob Speed is : "+speed);

 speed = Mixer.knobToRight();
System.out.println(" Right Knob Speed is : "+speed);
 
 speed = Mixer.knobToRight();
System.out.println(" Right Knob Speed is : "+speed);

 speed = Mixer.knobToRight();
System.out.println(" Right Knob Speed is : "+speed);
 int speed1 = Mixer.knobToleft();
System.out.println(" Left Knob Speed is : "+speed1);
Mixer.button();
 speed = Mixer.knobToRight();
System.out.println(" Right Knob Speed is : "+speed);
 speed1 = Mixer.knobToleft();
System.out.println(" Left Knob Speed is : "+speed1);
}

}