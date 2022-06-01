package code.binu;


import code.binu.jukebox.Jukebox;

import java.util.List;
import java.util.Set;

import code.binu.jukebox.CD;
import code.binu.jukebox.Playlist;
import code.binu.jukebox.CDPlayer;
import code.binu.jukebox.Song;
import code.binu.user.User;

public class Main {
	
	public static void main(String[] args) {
		CD cd1 = new CD();
		Song s1 = new Song("Song 1", cd1);
		Song s2 = new Song("Song 2", cd1);
		cd1.setSongs(List.of(s1,s2));
		
		CD cd2 = new CD();
		Song s3 = new Song("Song 3", cd2);
		Song s4 = new Song("Song 4", cd2);
		cd2.setSongs(List.of(s3, s4));
		
		Playlist p1 = new Playlist(List.of(s1, s2, s3, s4));
		CDPlayer cdp = new CDPlayer(p1, Set.of(cd1, cd2));
		
		Jukebox jb = new Jukebox(cdp);
		
		User user = new  User(jb);
		
		user.getJukebox().nextSongBtn();
		
		
	}
	

}
