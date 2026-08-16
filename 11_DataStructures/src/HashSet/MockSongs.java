package HashSet;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    public static List<Song> getSongsList() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("somersault", "zero 7", 147));
        songs.add(new Song("cassidy", "grateful dead", 158));
        songs.add(new Song("$10", "hitchhiker", 140));
        songs.add(new Song("$10", "hitchhiker", 140));
        songs.add(new Song("сassidy", "grateful dead", 158));
        
        return songs;

    }
}
