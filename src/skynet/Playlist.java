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
	
//	public void deleteTrack(int position) {
//		if(findTrack(song) > -1) {
//			getTracks().remove(findTrack(song));
//		} else {
//			System.out.println("Track not found");
//		}
//	}
	
//	public void listTracks() {
//		System.out.println(getName() + " by " + getArtist() + ":");
//		System.out.println("");
//		for (int i = 0; i < getTracks().size(); i++) {
//			System.out.println((i +1) + ". " + getTracks().get(i).getName() + 
//					" - " + getTracks().get(i).getDuration());
//		}
//	}

	public void setTracks(Song song) {
		if(findTrack(song) == -1) {
			getTracks().add(song);
		} else {
			System.out.println(song.getName() + " is already in the album");
		}
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
