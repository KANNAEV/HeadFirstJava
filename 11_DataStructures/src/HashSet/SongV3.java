// Класс Song с переопределенными методами equals и hashCode()
package HashSet;

public class SongV3 implements Comparable<SongV3> {
	private String title;
	private String artist;
	private int bpm;


	public SongV3(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	public boolean equals(Object aSong) {
		SongV3 other = (SongV3) aSong;
		// title - это String а у String уже есть переопределенный метод equals()
		return title.equals(other.getTitle());
	}

	public int hashCode() {
		// title - это String а у String уже есть переопределенный метод equals()
		return title.hashCode();
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
	return title + ":" + artist + "("+bpm+" b/m)";
}
	@Override
	public int compareTo(SongV3 s) {
		return title.compareTo(s.getTitle());
	}
}
