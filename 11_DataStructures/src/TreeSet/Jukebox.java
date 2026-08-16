package TreeSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox {
    public static void main(String[] args) {

        // Список наших песен
        List<Song> songList = MockSongs.getSongsList();

        // Создаем TreeSet с передачей метода сортировки через lambda
        Set<Song> songSet = new TreeSet<>((song1, song2) -> song1.getBpm() - song2.getBpm());

        // Добавляем в TreeSet наш список песен
        songSet.addAll(songList);

        // Отсортированы по битрейту
        System.out.println(songSet);


    }


}
