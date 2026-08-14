package List.ex01ListOfString;

import java.util.Collections;
import java.util.List;

public class Jukebox {
    public static void main(String[] args) {

        List<String> songList = MockSongs.getSongsList();
        System.out.println(songList); // Вывод в порядке добавления (как возвращает нам mock-код)
        Collections.sort(songList);  // метод sort для списков из пакета Collections.
        System.out.println(songList);
    }


}