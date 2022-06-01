package code.binu.jukebox;

import java.util.Set;

public class CDPlayer {
	private CD cd;
	
	private final Set<CD> cds;
	private Playlist playlist;
	
	public CDPlayer(Playlist playlist, Set<CD> cds) {
		this.playlist = playlist;
		this.cds = cds;
	}
	
	public void playNextSong() {
		
	}
	
	public void playPrevSong() {
		
	}
	
	public void addCD(CD cd) {
		this.cds.add(cd);
	}
	
	public void removeCD(CD cd) {
		this.cds.remove(cd);
	}

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}

	public Set<CD> getCds() {
		return cds;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	
	

}
