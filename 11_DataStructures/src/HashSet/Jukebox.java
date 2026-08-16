package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox {

    public static void main(String[] args) {
        // List
        List<Song> songList = MockSongs.getSongsList();
        System.out.println(songList);
        System.out.println();

        // Загрузим в HashSet - дубликаты исключены методами hashCode() и equqls() класса Song
        Set<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);
        System.out.println();

    }
}
