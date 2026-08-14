package List.ex02ListOfObjects;

import java.util.Comparator;

class BMPCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getBpm() - (o2.getBpm());
    }
}
