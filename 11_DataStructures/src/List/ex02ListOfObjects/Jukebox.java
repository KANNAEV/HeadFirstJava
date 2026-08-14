package List.ex02ListOfObjects;

import java.util.Collections;
import java.util.List;

public class Jukebox {
    public static void main(String[] args) {
        //Song с реализацией compareTo() интерфейса Comparable
        List<Song> songs = MockSongs.getSongsList();
        System.out.println("До сортировки: " + songs);
        Collections.sort(songs);
        System.out.println("После сортировки: " + songs);

        // Сортировка с помощью внешних компараторов
        // Collections.sort(songs, new BMPCompare()); // Старый стиль
        songs.sort(new BMPCompare());
        System.out.println("Сортировка с помощью класса BMPCompare: " + songs);
        songs.sort(new TitleCompare());
        System.out.println("Сортировка с помощью класса TitleCompare: " + songs);

        //Через lambda
        songs.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));

    }

}