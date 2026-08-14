package List.ex02ListOfObjects;

import java.util.ArrayList;
import java.util.List;

class MockSongs {

    public static List<Song> getSongsList() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("somersault", "zero 7", 147));
        songs.add(new Song("cassidy", "grateful dead", 158));
        songs.add(new Song("$10", "hitchhiker", 140));

        songs.add(new Song("havana", "cabello", 105));
        songs.add(new Song("Cassidy", "grateful dead", 158));
        songs.add(new Song("50 ways", "simon", 102));

        return songs;

    }

}
