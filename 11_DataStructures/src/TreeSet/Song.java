// Класс JukeboxStream.Song с переопределенными методами equals и hashCode()
package TreeSet;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int bpm;

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

//    @Override
//    public boolean equals(Object aSong) {
//        JukeboxStream.Song other = (JukeboxStream.Song) aSong;
//        // title - это String а у String уже есть переопределенный метод equals()
//        return title.equals(other.getTitle());
//    }
//
//    @Override
//    public int hashCode() {
//        // title - это String а у String уже есть переопределенный метод equals()
//        return title.hashCode();
//    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title + ":" + artist + "(" + bpm + " b/m)";
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }
}
