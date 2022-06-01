package code.binu.jukebox;

import java.util.List;

public class Playlist {
	private Song song;
	private final List<Song> songs;
	
	public Playlist(List<Song> songs) {
		this.songs = songs;
	}
	
	public Playlist(Song song, List<Song> songs) {
		this.song = song;
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public void shuffle() {
		
	}
	
	public Song getNextSong() {
		return null;
	}
	
	public Song getPrevSong() {
		return null;
	}
	
	public void setSong(Song song) {
		this.song = song;
	}
	
	public List<Song> getSongs() {
		return songs;
	}
	
	

}
