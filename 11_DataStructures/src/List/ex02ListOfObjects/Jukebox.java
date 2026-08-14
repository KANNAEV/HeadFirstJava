package List.ex02ListOfObjects;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox {
    public static void main(String[] args) {
        List<Song> songs_1 = MockSongs.getSongsList();
        System.out.println(songs_1);
        //Collections.sort(songs_1); // не скомпилируется - не знает по какому полю сортировать

        //Компаратор класса
        List<Song> songs_2 = MockSongs.getSongsList();
        System.out.println(songs_2);
        Collections.sort(songs_2);
        System.out.println(songs_2);


        // Внешний компаратор
        List<Song> songs_3 = MockSongs.getSongsList(); // тот же класс List.SongV2
        Comparator<Song> byTitle = Comparator.comparing(Song::getTitle); // Компоратор 1
        Comparator<Song> byArtist = Comparator.comparing(Song::getArtist); // Компоратор 2
        Comparator<Song> byBitRate = Comparator.comparing(Song::getBpm); // Компоратор 3
        Collections.sort(songs_3, byTitle); // Старый стиль
        songs_3.sort(byTitle); // Современный стиль с Java 8
        System.out.println(songs_3);
        songs_3.sort(byArtist);
        System.out.println(songs_3);
        songs_3.sort(byBitRate);
        System.out.println(songs_3);

        //Класс внешнего компоратора List.TitleCompare
        TitleCompare titleCompare = new TitleCompare();
        songs_3.sort(titleCompare);
        System.out.println(songs_3);

        //Через lambda
        songs_3.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));

    }

}