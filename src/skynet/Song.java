package skynet;

public class Song {
	private String name;
	private String artist;
	private int duration;
	
	public Song(String name, String artist, int duration) {
		super();
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
