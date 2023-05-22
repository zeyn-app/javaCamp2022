package business;

import java.util.List;

import org.jdbootcamp.homework.homework04.Album;

import entities.Song;

public class AlbumManager {
	private Album album;
	private List<Song> songs;

	public void add(Song song) {
		songs.add(song);
		album.setSongs(songs);
	}

	public void listSongs() {
		int index = 0;

		System.out.println("The songs of " + album.getName() + "");

		for (Song song : songs) {
			System.out.println(++index + ". " + song.getName());
		}
	}

	public void printInfo() {
		System.out.println(album.getName() + "\t" + "Sanatçı: " + album.getArtist().getName() + "\tprice: " + album.getPrice());
	}

}
