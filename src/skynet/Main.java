package skynet;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	private static ArrayList<Playlist> playlists = new ArrayList<Playlist>();
	private static Scanner scanner = new Scanner(System.in);

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
		
		Playlist playlist1 = new Playlist("Awesome Mixtape Vol. 1");
		Playlist playlist2 = new Playlist("Awesome Mixtape Vol. 2");
		
		playlists.add(playlist1);
		playlists.add(playlist2);
		
		playlist1.addTrack(discovery.getTracks().get(0));
		playlist1.addTrack(discovery.getTracks().get(1));
		playlist1.addTrack(discovery.getTracks().get(2));
		playlist1.addTrack(discovery.getTracks().get(3));
		playlist1.addTrack(discovery.getTracks().get(4));
		
		boolean quit = false;
		int choice = 0;
		
		System.out.println("Song Dumpster by Rapple");
		printMainInstructions();
		
		while (!quit) {			
			System.out.println("");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 0:
					printMainInstructions();
					break;
				case 1:
					listAllPlaylists();
					break;
				case 2:
					openPlaylist();
					break;
				case 3:
					createPlaylist();
					break;
				case 4:
					renamePlaylist();
					break;
				case 5:
					deletePlaylist();
					break;
				case 6:
					listAlbums();
					break;
				case 7:
					openAlbum();
					break;
				case 8:
					System.out.println("Goodbye");
					quit = true;
					break;
				default:
					System.out.println("Invalid selection. Try Again.");
					break;
			}
		}
	}
	
	// Instructions
	public static void printMainInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List all playlists.");
        System.out.println("\t 2 - To open a playlist.");
        System.out.println("\t 3 - To create a new playlist.");
        System.out.println("\t 4 - To rename a playlist.");
        System.out.println("\t 5 - To delete a playlist.");
        System.out.println("\t 6 - To view your albums.");
        System.out.println("\t 7 - To open an album.");
        System.out.println("\t 8 - To quit the application.");
	}

	public static void printPlaylistInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - To list all tracks.");
        System.out.println("\t 2 - To play playlist.");
        System.out.println("\t 3 - To rearrange song playlist.");
        System.out.println("\t 4 - To remove song playlist.");
        System.out.println("\t 5 - To go back.");
	}
	
	public static void printAlbumsInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List all albums.");
        System.out.println("\t 2 - To open an album.");
        System.out.println("\t 3 - Back.");
	}
	
	public static void printAlbumInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - List album tracks.");
        System.out.println("\t 2 - To add track to playlist.");
        System.out.println("\t 3 - Back.");
	}
	
	public static void printPlayInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To view options.");
        System.out.println("\t 1 - Play previous song.");
        System.out.println("\t 2 - Skip to next song.");
        System.out.println("\t 3 - Replay current song.");
        System.out.println("\t 4 - Back.");
	}
	
	// Main menu options
	public static void listAllPlaylists() {
		if(playlists.size() > 0) {
			for (int i = 0; i < playlists.size(); i++) {
				System.out.println((i + 1) + ". " + playlists.get(i).getName());
			}			
		} else {
			System.out.println("You have no playlists. You will never star in Guardians Of The Galaxy.");
		}
	}
	
	public static void openPlaylist() {
		System.out.println("Enter which playlist to open");
		String title = scanner.nextLine();
		int position = searchPlaylists(title);
		if(position != -1) {
			Playlist currentPlaylist = playlists.get(position);
			boolean mainMenu = false;
			printPlaylistInstructions();
			int choice = 0;
			while (!mainMenu) {
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
				switch (choice) {
				case 0:
					printPlaylistInstructions();
					break;
				case 1:
					listPlaylistTracks(currentPlaylist);
					break;
				case 2:
					playPlaylist(currentPlaylist);
//					System.out.println("Under Construction");
					break;
				case 3:
					rearrangeSongs(currentPlaylist);
					break;
				case 4:
					deleteSong(currentPlaylist);
					break;
				case 5:
					System.out.println("Back to main");
					mainMenu = true;
					break;
				default:
					System.out.println("Invalid");
					break;
				}
			}
		} else {
			System.out.println("Playlist not found");
		}
	}
	
	public static void viewAlbumsMenu() {
		boolean mainMenu = false;
		printAlbumsInstructions();
		int choice = 0;
		while (!mainMenu) {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 0:
				printAlbumsInstructions();
				break;
			case 1:
				listAlbums();
				break;
			case 2:
				openAlbum();
				break;
			case 3:
				System.out.println("Back to Main");
				mainMenu = true;
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
	}
	
	public static void createPlaylist() {
		System.out.println("Enter the title of the new playlist");
		String title = scanner.nextLine();
		if(searchPlaylists(title) == -1) {
			Playlist newPlaylist = new Playlist(title);
			playlists.add(newPlaylist);
			System.out.println(newPlaylist.getName() + " added");
		} else {
			System.out.println(title + " is already in playlist");
		}
	}
	
	public static void renamePlaylist() {
		System.out.println("Enter the playlist to rename (mind spelling and cap)");
		String title = scanner.nextLine();
		int position = searchPlaylists(title);
		if(position != -1) {
			Playlist currentPlaylist = playlists.get(position);
			System.out.println(currentPlaylist.getName() + " found");
			System.out.println("What is the new name");
			String newName = scanner.nextLine();
			int position2 = searchPlaylists(newName);
			if(position2 == -1) {
				currentPlaylist.setName(newName);
			} else {
				System.out.println("There is already a playlist named " + newName);
			}
		} else {
			System.out.println("No playlists");
		}
	}
	
	public static void deletePlaylist() {
		System.out.println("Enter the playlist to delete (mind spelling and cap)");
		String title = scanner.nextLine();
		int position = searchPlaylists(title);
		if(position != -1) {
			playlists.remove(position);
			System.out.println(title + " deleted");
		} else {
			System.out.println("Playlist not found");
		}
	}
	
	private static int searchPlaylists(String title) {
		for (int i = 0; i < playlists.size(); i++) {
			if(playlists.get(i).getName().toLowerCase().equals(title.toLowerCase())) {
				return i;
			}
		}
		return -1;
	}
	
	// Albums Options
	public static void listAlbums() {
		if(albums.size() > 0) {
			for (int i = 0; i < albums.size(); i++) {
				System.out.println((i + 1) + ". " + albums.get(i).getName());
			}
		} else {
			System.out.println("There are no albums. The Music Industry has imploded.");
		}
	}
	
	public static void openAlbum() {
		System.out.println("Enter the name of the album you want to open");
		String album = scanner.nextLine();
		int position = findAlbum(album);
		if(position != -1) {
			Album currentAlbum = albums.get(position);
			System.out.println(currentAlbum.getName() + " by " + currentAlbum.getArtist());
			printAlbumInstructions();
			boolean back = false;
			int choice = 0;
			while (!back) {
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
				switch (choice) {
					case 0:
						printAlbumInstructions();
						break;
					case 1:
						listAlbumTracks(currentAlbum);
						break;
					case 2:
						addToPlaylist(currentAlbum);
						break;
					case 3:
						System.out.println("Back To Main");
						back = true;
						break;
					default:
						System.out.println("Invalid");
						break;
				}
			}
		} else {
			System.out.println("Album not found");
		}
	}
	
	private static int findAlbum(String name) {
		for (Album album : albums) {
			if(album.getName().toLowerCase().equals(name.toLowerCase())) {
				return albums.indexOf(album);
			}
		}
		return -1;
	}

	// Album Options
	public static void listAlbumTracks(Album album) {
		album.listTracks();
	}
	
	public static void addToPlaylist(Album album) {
		System.out.println("Enter track number");
		int track = scanner.nextInt();
		if(track >= 1 && track <= album.getTracks().size()) {
			Song position = album.getTracks().get(track - 1);
			scanner.nextLine();
			System.out.println("Enter playlist to add " + position.getName());
			String playlistName = scanner.nextLine();
			int playlist = searchPlaylists(playlistName);
			if(playlist != -1) {
				Playlist currentPlaylist = playlists.get(playlist);
				currentPlaylist.addTrack(position);
			} else {
				System.out.println("Playlist not found");
			}
		} else {
			System.out.println("Track not available");
		}
	}
	
	// Playlist Options
	public static void listPlaylistTracks(Playlist playlist) {
		playlist.listTracks();
	}
	
	public static void deleteSong(Playlist playlist) {
		System.out.println("Enter track number to remove");
		int position = scanner.nextInt();
		if(position >= 1 && position <= playlist.getTracks().size()) {
			position -= 1;
			System.out.println(playlist.getTracks().get(position).getName());
			playlist.deleteTrack(position);
		} else {
			System.out.println("Invalid track");
		}
	}
	
	public static void rearrangeSongs(Playlist playlist) {
		System.out.println("Enter the track number to arrange");
		int songPosition = scanner.nextInt();
		if(songPosition >= 1 && songPosition <= playlist.getTracks().size()) {
			Song currentSong = playlist.getTracks().get(songPosition);
			System.out.println("What position do you want " + currentSong.getName() + " to be");
			scanner.nextLine();
			int newPosition = scanner.nextInt();
			if(newPosition >= 1 && newPosition <= playlist.getTracks().size()) {
				System.out.println();
				playlist.moveTrack(currentSong, newPosition);
			}
		} else {
			System.out.println("Out of bounds");
		}
	}
	
	// Play Options
	public static void playPlaylist(Playlist playlist) {
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<Song> listIterator = playlist.getTracks().listIterator();
		
		if(playlist.getTracks().isEmpty()) {
			System.out.println("How is one to play a song when there are no songs to play");
			return;
		} else {
			printPlayInstructions();
			System.out.println("Now playing " + listIterator.next().getName());
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
				case 0:
					printPlayInstructions();
					break;
				case 1:
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						goingForward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().getName());
					} else {
						System.out.println("Reached the beginning of the list");
						goingForward = true;
					}
					break;
				case 2:
					if(!goingForward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						goingForward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().getName());
					} else {
						System.out.println("Reached the end of the list");
						goingForward = false;
					}
					break;
				case 3:
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now playing " + listIterator.previous().getName());
							goingForward = false;
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now playing " + listIterator.next().getName());
							goingForward = true;
						}
					}

					break;
				case 4:
					System.out.println("Done playing");
					quit = true;
					break;
				default:
					System.out.println("Invalid");
					break;
			}
		}
	}
}
