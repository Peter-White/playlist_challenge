package skynet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Album> albums = new ArrayList<Album>();
		
		Album discovery = new Album("Discovery", "Daft Punk");
		discovery.setTracks(new Song("One More Time", 320));
		discovery.setTracks(new Song("Aerodynamic", 213));
		discovery.setTracks(new Song("Digital Love", 301));
		discovery.setTracks(new Song("Harder Better Faster Stronger", 225));
		discovery.setTracks(new Song("Crescendolls", 212));
		discovery.setTracks(new Song("Nightvision", 104));
		discovery.setTracks(new Song("Superheroes", 238));
		discovery.setTracks(new Song("High Life", 202));
		discovery.setTracks(new Song("Something About Us", 233));
		discovery.setTracks(new Song("Voyager", 228));
		discovery.setTracks(new Song("Veridis Quo", 345));
		discovery.setTracks(new Song("Short Circuit", 207));
		discovery.setTracks(new Song("Face To Face", 240));
		discovery.setTracks(new Song("Too Long", 600));
		
		albums.add(discovery);
		
		discovery.listTracks();
	}

}
