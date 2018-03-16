package skynet;

import java.util.ArrayList;

public class Playlist {

	private String name;
	private ArrayList<Song> tracks;
	
	public Playlist(String name) {
		super();
		this.name = name;
		this.tracks = new ArrayList<Song>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Song> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Song> tracks) {
		this.tracks = tracks;
	}

	public int findTrack(String name) {
		for (Song song : getTracks()) {
			if(song.getName().equals(name)) {
				return getTracks().indexOf(song);
			}
		}
		return -1;
	}
	public int findTrack(Song songo) {
		for (Song song : getTracks()) {
			if(song.equals(songo)) {
				return getTracks().indexOf(song);
			}
		}
		return -1;
	}
}
