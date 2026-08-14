package List.ex01ListOfString;

import java.util.ArrayList;
import java.util.List;

class MockSongs {

    public static List<String> getSongsList() {
        List<String> songs = new ArrayList<>(); // Ромбовидный оператор
        songs.add("Арбузная");
        songs.add("Банановая");
        songs.add("Виноградная");
        songs.add("Арбузная");
        songs.add("Грушевая");
        return songs;
    }


}
