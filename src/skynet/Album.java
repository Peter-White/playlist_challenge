package skynet;

import java.util.ArrayList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> tracks;
	
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.tracks = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Song> getTracks() {
		return tracks;
	}

	public void setTracks(Song song) {
		if(findTrack(song) == -1) {
			getTracks().add(song);
		} else {
			System.out.println(song.getName() + " is already in the album");
		}
	}
	
	public void listTracks() {
		for (int i = 0; i < getTracks().size(); i++) {
			System.out.println((i +1) + ". " + getTracks().get(i).getName() + 
					" - " + getTracks().get(i).getDuration());
		}
	}
	
	public int findTrack(String name) {
		for (Song song : tracks) {
			if(song.getName().equals(name)) {
				return tracks.indexOf(song);
			}
		}
		return -1;
	}
	public int findTrack(Song songo) {
		for (Song song : tracks) {
			if(song.equals(songo)) {
				return tracks.indexOf(song);
			}
		}
		return -1;
	}
}
