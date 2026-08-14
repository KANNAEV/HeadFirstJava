package List;

import List.ex01GetMockData.MockSongs1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> songs_1 = MockSongs1.getSongsList();
        System.out.println(songs_1);
        Collections.sort(songs_1); //Сортируем по алфавиту
        System.out.println(songs_1);

        //Компаратор класса
        List<SongV2> songs_2 = MockSongs2.getSongsList();
        System.out.println(songs_2);
        Collections.sort(songs_2);
        System.out.println(songs_2);


        // Внешний компаратор
        List<SongV2> songs_3 = MockSongs2.getSongsList(); // тот же класс List.SongV2
        Comparator<SongV2> byTitle = Comparator.comparing(SongV2::getTitle); // Компоратор 1
        Comparator<SongV2> byArtist = Comparator.comparing(SongV2::getArtist); // Компоратор 2
        Comparator<SongV2> byBitRate = Comparator.comparing(SongV2::getBpm); // Компоратор 3
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