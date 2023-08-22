class AscendingOrder
{
public static void main(String asc[])
{
 int bucket = 0;
int fun[] = {3,5,1,8,2,9,4,7,6};
for(int plus=0 ; plus<fun.length ; plus++)
{
 System.out.println(" Actual order is :"+fun[plus]);
 System.out.println("---------------------------");
 }
 System.out.println(" ");
 
 for(int plus = 0 ; plus<fun.length ; plus++)
 {
   for(int pull = plus+1 ; pull<fun.length ; pull++)
   {
    if(fun[plus] > fun[pull])
	{
	  bucket = fun[plus]; 
	  fun[plus] = fun[pull];
	  fun[pull] = bucket;
	  }}}
System.out.println(" ");
System.out.println(" Ascending order is :" );
for(int plus=0; plus<fun.length ; plus++)
{
  System.out.print(fun[plus]);
  System.out.print("..");
  }
 
  }}