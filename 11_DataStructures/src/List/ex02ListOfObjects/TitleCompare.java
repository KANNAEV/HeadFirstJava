package List.ex02ListOfObjects;

import java.util.Comparator;

class TitleCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
