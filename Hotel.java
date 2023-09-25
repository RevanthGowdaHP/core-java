class Hotel{
String menus[] = new String[10];
int index;

public boolean addMenu(String menu){
   boolean isAdded = false;
   if( index<menus.length){
	    if( menu != null){
			boolean duol = checkDuplicateName(menu);
			if(duol == false){
			  menus[index] = menu;
			  isAdded = true;
			  index++;
			}
   }
   else{
   System.out.println(" Cannot give null value");
   }
   }
   else{
	   System.out.println(" Menu list exceeded in length");
   }
  
   return isAdded;
}

public void getMenu(){

   System.out.println("New menu added are :");
   for(index = 0 ; index<menus.length ; index++){
    System.out.println("                       "+menus[index]);
   }
}

public void delete(String menu){
		String newMenu[] = new String[menus.length-1];
		int muse=0;
		for(int dus=0; dus<menus.length ;dus++){
			if(menus[dus] != menu){
				newMenu[muse++] = menus[dus];
			}
		}
		System.out.println("The deleted menu name is :" +menu);
		System.out.println("The New menu are:");
		for(int mo = 0 ; mo < newMenu.length; mo++){
			System.out.println(newMenu[mo]);
		}
	}
public boolean checkDuplicateName(String menuu){
	boolean check = false;
	for(int hote = 0 ; hote<menus.length; hote++){
		if(menus[hote]== menuu){
			check = true;
			System.out.println("'"+menuu+"' already exist.");
		}
	}
	return check;
}

}