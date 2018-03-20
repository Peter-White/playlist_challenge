package skynet;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	private String name;
	private LinkedList<Song> tracks;
	
	public Playlist(String name) {
		super();
		this.name = name;
		this.tracks = new LinkedList<Song>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		String oldName = getName();
		this.name = name;
		System.out.println(oldName + " is now " + getName());
	}
	
	public LinkedList<Song> getTracks() {
		return tracks;
	}
	
	public void deleteTrack(int position) {
		Song track = getTracks().get(position - 1);
		String title = track.getName();
		getTracks().remove(position);
		System.out.println(title + " removed from " + getName());
	}
	
	public void listTracks() {
		for (int i = 0; i < getTracks().size(); i++) {
			System.out.println((i +1) + ". " + getTracks().get(i).getName() + 
					" - " + getTracks().get(i).getDuration());
		}
	}
	
	public void moveTrack(Song song, int place) {
		getTracks().remove(song);
		ListIterator<Song> songListIterator = getTracks().listIterator();
		
		while (songListIterator.hasNext()) {
			if(songListIterator.nextIndex() == (place - 1)) {
				songListIterator.add(song);
				return;
			}
		}
	}
	
	public void addTrack(Song newSong) {
		ListIterator<Song> songListIterator = getTracks().listIterator();
		songListIterator.add(newSong);
	}

	public void setTracks(Song song) {
		if(findTrack(song) == -1) {
			getTracks().add(song);
		} else {
			System.out.println(song.getName() + " is already in the album");
		}
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
