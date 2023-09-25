class OttPlatFormsTester{
    public static void main(String arra[]){
	
	OttPlatforms ott = new OttPlatforms();
	ott.addMovies("Hebbuli");
	ott.addMovies("Maanikya");
	ott.addMovies("Kichha");
	ott.addMovies("Bachhan");
	ott.addMovies("Maanikya");
	ott.addMovies("Vikram");
	ott.addMovies("Samrat");
	ott.addMovies("Samrat");
	ott.getMovieNames();
	String movie = ott.searchMovieName("Vikram");
	System.out.println(" Get permium to watch this movie  '"+movie+"'");
	ott.deleteMovieName("Maanikya");
	}
}