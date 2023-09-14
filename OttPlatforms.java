class OttPlatforms{

String movieNames[] = new String[5];
int index;
        //create/save operation
      public boolean addMovies(String movie){
		boolean isAdded = false;
		if(index < movieNames.length){
			
			System.out.println(" method invoked");
			
			if(movie != null){
				boolean dull = checkDuplicateMovie(movie);
				if(dull == false){
				System.out.println(" method validation");
		       movieNames[index]= movie;
		       index++;
		       isAdded = true;
				}
		}
		 
	        else{
		         System.out.println(" Movie Names not added");
		            }
		   }
		else{
			 System.out.println("Index exceeded");
		 }
		System.out.println(" method invoked ended");
		 return isAdded;
		}
		//Read operation

     public void getMovieNames(){
		   System.out.println("Movies available in this OttPlatform are :");
	 for(int ind = 0 ; ind<movieNames.length ; ind++){
	    
		  System.out.println("                   				"+movieNames[ind]);
	 }
	 
	 }
     public boolean checkDuplicateMovie(String movie){
		 boolean duplicate = false;
		 for(int ceh = 0 ; ceh<movieNames.length ; ceh++){
			 if(movieNames[ceh]==movie){
				 duplicate = true;
				 System.out.println("'"+movie+"' movie name already added in this OttPlatform");
			 }
		 }
		 return duplicate;
	 }

}