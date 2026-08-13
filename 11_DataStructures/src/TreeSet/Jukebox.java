package TreeSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox {
	public static void main(String[] args) {
		List<Song> songList = MockSongs.getSongsList();
		Set<Song> songSet = new TreeSet<Song>(songList);

		System.out.println(songSet); // Отсортированы по методу compareTo();

		Set<Song> songSetByTitle = new TreeSet<>((s1, s2) -> s1.getArtist().compareTo(s2.getArtist()));
		songSetByTitle.addAll(songList);
		System.out.println(songSetByTitle); // Отсортированы по методу Comparator из Lambda();


	}




}
