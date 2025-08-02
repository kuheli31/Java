//15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

import java.util.ArrayList;
import java.util.Random;

// Song class to represent individual songs
class Song {
    String name;
    String singer;
    
    // Constructor for Song
    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }
    
    // Getter for song name
    public String getName() {
        return name;
    }
    
    // Getter for singer
    public String getSinger() {
        return singer;
    }
    
    // Display song info
    public void displaySong() {
        System.out.println("Song: " + name + " by " + singer);
    }
}

// MusicLibrary class to manage collection of songs
public class MusicLibrary {
    private ArrayList<Song> music;
    
    // Constructor
    public MusicLibrary() {
        music = new ArrayList<>();
    }
    
    // Add song
    public void addSong(String name, String singer) {
        Song newSong = new Song(name, singer);
        music.add(newSong);
        System.out.println("Song added successfully!");
    }
    
    // Remove song by name
    public void removeSong(String name) {
        for (int i = 0; i < music.size(); i++) {
            if (music.get(i).getName().equals(name)) {  // use .equals() for string comparison
                music.remove(i);
                System.out.println("Song '" + name + "' removed successfully!");
                return;
            }
        }
        System.out.println("Song '" + name + "' not found!");
    }
    
    // Play random song
    public void playRandomSong() {
        if (music.isEmpty()) {
            System.out.println("No songs in the library to play!");
            return;
        }
        
        Random random = new Random();
        int randomIndex = random.nextInt(music.size());
        Song randomSong = music.get(randomIndex);
        
        System.out.println("🎵 Now playing: " + randomSong.getName() + " by " + randomSong.getSinger() + " 🎵");
    }
    
    // Display all songs
    public void display() {
        if (music.isEmpty()) {
            System.out.println("No songs found in the library.");
        } else {
            System.out.println("All Songs in Library:");
            for (Song song : music) {
                song.displaySong();
            }
        }
    }
    
    // Get total number of songs
    public int getTotalSongs() {
        return music.size();
    }
    
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        
        // Add songs
        library.addSong("Qatal", "Guru");
        library.addSong("Saiyara", "Sachet");
        library.addSong("Shape of You", "Ed Sheeran");
        library.addSong("Raaz", "Arijit Singh");
        library.addSong("Tum Se", "Arijit Singh");
        
        System.out.println("\n--- Current Library ---");
        library.display();
        
        System.out.println("\n--- Playing Random Songs ---");
        library.playRandomSong();
        library.playRandomSong();
        library.playRandomSong();
        
        System.out.println("\n--- Removing Songs ---");
        library.removeSong("Tum Se");
        library.removeSong("Paban");  // This won't be found
        
        System.out.println("\n--- Updated Library ---");
        library.display();
        
        System.out.println("\nTotal songs in library: " + library.getTotalSongs());
        
        System.out.println("\n--- Playing Random Song from Updated Library ---");
        library.playRandomSong();
    }
}