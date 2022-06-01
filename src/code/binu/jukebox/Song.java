package code.binu.jukebox;

public class Song {
	private String title;
	private CD cd;
	
	public Song(String title, CD cd) {
		this.title = title;
		this.cd = cd;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}
	
	

}
