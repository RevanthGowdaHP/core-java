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


}