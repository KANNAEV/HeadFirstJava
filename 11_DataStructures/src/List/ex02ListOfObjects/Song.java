package List.ex02ListOfObjects;

public class Song implements Comparable<Song> {
    private final String title;
    private final String artist;
    private final int bpm;


    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

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
        return title + " " + artist + " " + bpm;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }
}
