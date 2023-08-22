class ModulusBro
{
	public static void main(String bro[]){
	
		  getrem(23,2);
	getrem(42,3);
	getrem(122,79);
	getrem(86,55);
	getrem(88,8);
	getrem(988,56);
	getrem(383,83);
	getrem(66,79);
	getrem(946,91);
	getrem(46,14);
	getrem(646,7);
	getrem(44,62);
	getrem(355,7);
	getrem(94,8);
	getrem(164,66);
	getrem(76,64);
	getrem(774,99);
	getrem(255,4);
	getrem(74,64);
	getrem(764,55);
	getrem(685,73);
	
	System.out.println("...................................");	
		getrem(23,3,2);
	getrem(42,3,3);
	getrem(122,3,79);
	getrem(86,3,55);
	getrem(88,3,8);
	getrem(988,3,56);
	getrem(383,3,83);
	getrem(66,3,79);
	getrem(946,3,91);
	getrem(46,3,14);
	getrem(646,3,7);
	getrem(44,3,62);
	getrem(355,3,7);
	getrem(94,3,8);
	getrem(164,3,66);
	getrem(76,3,64);
	getrem(774,3,99);
	getrem(255,3,4);
	getrem(74,3,64);
	getrem(764,3,55);
	getrem(685,3,73);  
		  
		  
		  
	}
	
	public static void getrem(int what, int welcome){
		 int elderOld = what%welcome;
		 
System.out.println("The Modulus of 2 numbers "+what+"%"+welcome+"="+elderOld);
	}
	public static void getrem(int what, int welcome,int tu){
		 int bigBro= what%welcome%tu;
		 System.out.println("The Modulus of 3 numbers "+what+"%"+welcome+"%"+tu+"="+bigBro);
}
}