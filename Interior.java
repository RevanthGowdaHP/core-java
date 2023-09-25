class Interior{

String materials[] = new String[10];
int index;

public boolean addMaterials(String material){
    boolean isAdded = false;
	if(index < materials.length){
		if(material != null){
			boolean mat = checkMaterialExist(material);
			if( mat == false){
	materials[index]= material;
	isAdded = true;
	index++;
			}
	}
    else{
	System.out.println("The materials not added ");
	}
	}
	else{
		System.out.println(" Materials added got exceeded");
	}
	
	return isAdded;
}
public void getMaterials(){
System.out.println("The materials added are :");
for(index = 0 ; index<materials.length ; index++){
System.out.println("                "+materials[index]);
}
}

public boolean checkMaterialExist(String material){
	boolean check = false;
	for(int inter = 0 ;  inter<materials.length ; inter++){
		if (materials[inter] == material){
			check = true;
			System.out.println("'"+material+"' material already there in the interior");
		}
	}
return check;
}

public boolean deleteMaterial(String material){
	boolean isDeleted = false;
	int sum = 0;
	String newMaterial[] = new String[materials.length-1];
	for(int rial = 0 ; rial<materials.length; rial++){
		if(materials[rial]!= material){
			newMaterial[sum++]=materials[rial];
		}
	}
	System.out.println("The deleted material name is :" +material);
		System.out.println("The New materials are:");
		for(int mo = 0 ; mo < newMaterial.length; mo++){
			System.out.println(newMaterial[mo]);
		}
		 return isDeleted;
}

 public String searchMaterial(String material){
	 String inventory = null;
	 for(int inv = 0 ; inv< materials.length ; inv ++){
		 if(materials[inv]== material){
			 inventory = materials[inv];
		 }
	 }
	 return inventory;
 }
}