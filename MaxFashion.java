class MaxFashion{


int id;
String[] brands ;
String location;
int noOfWorkers;
String[] categories;

public MaxFashion(int id, String[] brands , String locationa , int noOfWorkers , String[] categories){
	this.id = id;
	this.brands = brands;
	this.location =location;
	this.noOfWorkers= noOfWorkers;
	this.categories = categories;	
}

public void sell(){
System.out.println(" The showroom moto is to sell quality and best priced cloths");

}
public void makeMoney(){
System.out.println(" The showroom second moto is to make lot of money");
System.out.println(id+" "+" "+location+" "+noOfWorkers+" ");

}

public void getallBrands(){
	
	for(int batte =0 ; batte<brands.length ; batte++){
		
		System.out.println(" The Brands available in MaxFashion Showroom are :"+brands[batte]);
}
}
	
    public void getallcategories(){
	
	for(int gender =0 ; gender<categories.length; gender++){
		
		System.out.println(" The general categories are :" +categories[gender]);
		}
}
 
}


