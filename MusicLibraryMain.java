public class MusicLibraryMain {
    
    private String[] songs;
    private int songCount;

    
    public MusicLibraryMain(int size) {
        songs = new String[size];
        songCount = 0;
    }

  
    public void addSong(String songName) {
        if (songCount < songs.length) {
            songs[songCount++] = songName;
            System.out.println("Song added: " + songName);
        } else {
            System.out.println("Music library is full! Cannot add more songs.");
        }
    }

   
    public void removeSong(String songName) {
        boolean found = false;
        for (int i = 0; i < songCount; i++) {
            if (songs[i].equalsIgnoreCase(songName)) {
                for (int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[--songCount] = null;
                found = true;
                System.out.println("Song removed: " + songName);
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found: " + songName);
        }
    }

    
    public void playRandomSong() {
        if (songCount == 0) {
            System.out.println("No songs available to play.");
            return;
        }
        int randomIndex = (int)(Math.random() * songCount);
        System.out.println("Now playing: " + songs[randomIndex]);
    }

    public void displaySongs() {
        System.out.println("\n--- Music Library ---");
        if (songCount == 0) {
            System.out.println("No songs in the library.");
        } else {
            for (int i = 0; i < songCount; i++) {
                System.out.println((i + 1) + ". " + songs[i]);
            }
        }
    }

    
    public static void main(String[] args) {
        MusicLibraryMain library = new MusicLibraryMain(5);

        library.addSong("Tensiondo");
        library.addSong("Kung Siya Man");
        library.addSong("Bulong");

        library.displaySongs();

        library.playRandomSong();

        library.removeSong("Kung Siya Man");

        library.displaySongs();

        library.playRandomSong();
    }
}
