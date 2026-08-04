package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {

	public static void main(String[] args) {
		List<SongV3> songList = MockSongs3.getSongsList();
		System.out.println(songList);
		System.out.println();

		songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songList);
		System.out.println();

		// Загрузим в HashSet
		Set<SongV3> songSet = new HashSet<>(songList);
		System.out.println(songSet);
		System.out.println();

	}
}
