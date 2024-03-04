package business;

import java.util.Objects;

/**
 *
 * @author michelle
 */
public class Song {
    private String artist;
    private String title;

    /**
     * no argument constructor for songs
     */
    public Song() {
        this.artist = "Joe Bloggs";
        this.title = "Mmmbop";
    }

    /**
     * argument constructor for songs
     * @param artist artist field of song
     * @param title field of song
     */
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * overriden equals method to test whether two songs are the same
     * @param o parameter song to be compared to song
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(artist, song.artist) && Objects.equals(title, song.title);
    }

    /**
     * @return hash map value
     */
    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
