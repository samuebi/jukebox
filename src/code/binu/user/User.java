package code.binu.user;

import code.binu.jukebox.Jukebox;

public class User {
	
	private Jukebox jukebox;
	
	public User(Jukebox jukebox) {
		this.jukebox = jukebox;
	}

	public Jukebox getJukebox() {
		return jukebox;
	}
	
}
