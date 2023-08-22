class Fruits{

static String fruits[]={"Apple", "Banana", "Orange", "Mango", "Grapes"};

public static void main(String arg[])
    {

Stirng one= getfru(fruits,3); // ReturnType variable = getMethodName(static variableName, index number) 
String two  = getfru(fruits,2);
System.out.println("The fruits are:"+one);
System.out.println("The fruits are:"+two);



    }


public static String getfru(String sanjay[], int index) // sanjay[]= fruits[]
   {   // for-each loop
   
     
System.out.println("method start");
     
	 int track = 0;
	 System.out.println("Track contains: "+track);
	 for(String look : sanjay)   // for(datatype variable : array variable){}   // for variable in list(python)
       {  
System.out.println("loop start");
		 
//track(2) == 2
	       if(track == index)
	        {
				System.out.println( "variable contains : "+sanjay[index]);
	          return look;  // look[] = sanjay[]
	        }
           track++;
		   System.out.println(" loop terminal track value: "+track);
        }
		System.out.println(" nothing");
	 return "nothing" ;
    
   }

}