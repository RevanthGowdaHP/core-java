class Factorial
{
public static void main(String fact[]){
	
getLoMacha(3);
getLoMacha(8);
getLoMacha(5);

// adv of method code reuse ability
// getLoMacha(int niceNum)-- is a parameter variable which is enclosed in () -(int niceNum)
 // getLoMacha is a methodName
}
//acess-modifier returnType methodName(parameter variable)
public static void getLoMacha(int niceNum){
 int bucket = 1 ;
 for(int bro = 1 ; bro<= niceNum; bro++)
 {
    bucket = bucket*bro;
 }
   System.out.println("Factorial of "+niceNum+" " + bucket);
 }
					
 }