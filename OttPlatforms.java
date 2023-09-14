class OttPlatforms{

String movieNames[] = new String[5];
int index;
        //
      public boolean addMovies(String movie){
		boolean isAdded = false;
		if(movie != null){
		 movieNames[index]= movie;
		 index++;
		 isAdded = true;
		 
		}
		 
		 
		 else{
		     System.out.println(" Movie Names not added");
		 }
		 return isAdded;
		}

     public void getMovieNames(){
		   System.out.println("Movies available in this OttPlatform are :");
	 for(int ind = 0 ; ind<movieNames.length ; ind++){
	    
		  System.out.println(movieNames[ind]);
	 }
	 
	 }


}