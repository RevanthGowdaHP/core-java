class Spotify {
    String musics[] = new String[10];
    int index;

    public boolean addMusic(String music) {
        boolean isAdded = false;
        if (index < musics.length) {
            if (music != null) {
                boolean dup = checkDuplicate(music);
                if (dup==false) {
                    musics[index] = music;
                    isAdded = true;
                    index++;
                } else {
                    System.out.println("Music '" + music + "' already exists.");
                }
            } else {
                System.out.println("New music not added because it is null.");
            }
        } else {
            System.out.println("Music limit exceeded");
        }
        return isAdded;
    }

    public void getMusic() {
        System.out.println("New musics added are :");
        for (int ind = 0; ind < index; ind++) {
            System.out.println("                     " + musics[ind]);
        }
    }
	public void delete(String music){
		String newMusic[] = new String[musics.length-1];
		int muse=0;
		for(int dus=0; dus<musics.length ;dus++){
			if(musics[dus] != music){
				newMusic[muse++] = musics[dus];
			}
		}
		System.out.println("The deleted music name is :" +music);
		System.out.println("The New music are:");
		for(int mo = 0 ; mo < newMusic.length; mo++){
			System.out.println(newMusic[mo]);
		}
	}

    public boolean checkDuplicate(String music) {
        boolean check = false;
        for (int duo = 0; duo < musics.length; duo++) {
            if (musics[duo]== music){
                check = true;
               
            }
        }
        return check;
    }
}
