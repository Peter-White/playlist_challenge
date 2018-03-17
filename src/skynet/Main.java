package skynet;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	private static ArrayList<Playlist> playlists = new ArrayList<Playlist>();

	public static void main(String[] args) {
		
		Album discovery = new Album("Discovery", "Daft Punk");
		discovery.setTracks(new Song("One More Time", discovery.getArtist(), 320));
		discovery.setTracks(new Song("Aerodynamic", discovery.getArtist(), 213));
		discovery.setTracks(new Song("Digital Love", discovery.getArtist(), 301));
		discovery.setTracks(new Song("Harder Better Faster Stronger", discovery.getArtist(), 225));
		discovery.setTracks(new Song("Crescendolls", discovery.getArtist(), 212));
		discovery.setTracks(new Song("Nightvision", discovery.getArtist(), 104));
		discovery.setTracks(new Song("Superheroes", discovery.getArtist(), 238));
		discovery.setTracks(new Song("High Life", discovery.getArtist(), 202));
		discovery.setTracks(new Song("Something About Us", discovery.getArtist(), 233));
		discovery.setTracks(new Song("Voyager", discovery.getArtist(), 228));
		discovery.setTracks(new Song("Veridis Quo", discovery.getArtist(), 345));
		discovery.setTracks(new Song("Short Circuit", discovery.getArtist(), 207));
		discovery.setTracks(new Song("Face To Face", discovery.getArtist(), 240));
		discovery.setTracks(new Song("Too Long", discovery.getArtist(), 600));
		albums.add(discovery);
		Album downwardSpiral = new Album("The Downward Spiral", "Nine Inch Nails");
		downwardSpiral.setTracks(new Song("Mr. Self Distruct", downwardSpiral.getArtist(), 270));
		downwardSpiral.setTracks(new Song("Piggy", downwardSpiral.getArtist(), 264));
		downwardSpiral.setTracks(new Song("Hersey", downwardSpiral.getArtist(), 234));
		downwardSpiral.setTracks(new Song("March Of The Pigs", downwardSpiral.getArtist(), 178));
		downwardSpiral.setTracks(new Song("Closer", downwardSpiral.getArtist(), 373));
		downwardSpiral.setTracks(new Song("Ruiner", downwardSpiral.getArtist(), 296));
		downwardSpiral.setTracks(new Song("The Becoming", downwardSpiral.getArtist(), 332));
		downwardSpiral.setTracks(new Song("I Do Not Want This", downwardSpiral.getArtist(), 341));
		downwardSpiral.setTracks(new Song("Big Man With A Gun", downwardSpiral.getArtist(), 96));
		downwardSpiral.setTracks(new Song("A Warm Place", downwardSpiral.getArtist(), 202));
		downwardSpiral.setTracks(new Song("Eraser", downwardSpiral.getArtist(), 294));
		downwardSpiral.setTracks(new Song("Reptile", downwardSpiral.getArtist(), 412));
		downwardSpiral.setTracks(new Song("The Downward Spiral", downwardSpiral.getArtist(), 237));
		downwardSpiral.setTracks(new Song("Hurt", downwardSpiral.getArtist(), 373));
		albums.add(downwardSpiral);
		
		
	}
	
	public static void printInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List all playlists.");
        System.out.println("\t 2 - To open a playlist.");
        System.out.println("\t 3 - To create a new playlist.");
        System.out.println("\t 4 - To rename a playlist.");
        System.out.println("\t 5 - To delete a playlist.");
        System.out.println("\t 6 - To view your albums.");
        System.out.println("\t 7 - To quit the application.");
	}

	public static void printAlbumsInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List all albums.");
        System.out.println("\t 2 - To open an album.");
        System.out.println("\t 3 - To quit the application.");
	}
	
	public static void printAlbumInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List album tracks.");
        System.out.println("\t 2 - To add track to playlist.");
        System.out.println("\t 3 - To quit the application.");
	}
	
	public static void printPlayInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - Play previous song.");
        System.out.println("\t 2 - Skip to next song.");
        System.out.println("\t 3 - Replay current song.");
        System.out.println("\t 4 - Back.");
	}
	
	public static void listAllPlaylists() {
		for (int i = 0; i < playlists.size(); i++) {
			System.out.println((i + 1) + ". " + playlists.get(i).getName());
		}
	}
	
	public static void listSongs() {
		for (Album album : albums) {
			System.out.println(album.getName() + " by " + album.getArtist());
			for (Song song : album.getTracks()) {
				System.out.println(song.getName());
			}
		}
	}
}
