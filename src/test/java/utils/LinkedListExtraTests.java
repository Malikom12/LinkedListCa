package utils;

import business.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class LinkedListExtraTests {

    /**
     * Test method for adding a song to an empty list.
     * Verifies that the song is added correctly, list size increases, it's not empty,
     * and the song becomes the tail of the list.
     */
    @Test
    public void testAddToEmptyList() {
        LinkedList list = new LinkedList();
        Song song = new Song("the weeknd", "blinded by the light");
        list.add(song);
        assertEquals(1, list.size());
        assertEquals(song, list.get(0));
        assertFalse(list.isEmpty());
        assertEquals(song, list.tail());
    }

    /**
     * Test method for adding a duplicate song to the list.
     * Verifies that only one instance of the duplicate song is added to the list.
     */
    @Test
    public void testAddDuplicateSong() {
        LinkedList list = new LinkedList();
        Song song = new Song("shaun mendes", "treat you better");
        list.add(song);
        list.add(song);
        assertEquals(1, list.size());
    }

    /**
     * Test method for adding non-duplicate songs to the list.
     * Verifies that each song is added correctly, list size increases,
     * songs are retrievable, and the last added song becomes the tail.
     */
    @Test
    public void testAddNonDuplicateSong() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("charlie puth", "attention");
        Song song2 = new Song("justing beibs", "company");
        list.add(song1);
        list.add(song2);
        assertEquals(2, list.size());
        assertEquals(song1, list.get(0));
        assertEquals(song2, list.get(1));
        assertFalse(list.isEmpty());
        assertEquals(song2, list.tail());
    }

    /**
     * Test method for adding multiple songs to an initially empty list.
     * Verifies that all songs are added correctly, list size matches the number of added songs,
     * songs are retrievable, and the last added song becomes the tail.
     */
    @Test
    public void testAddMultipleSongsToEmptyList() {
        LinkedList list = new LinkedList();
        Song song1 = new Song("selina", "wolves");
        Song song2 = new Song("ariana", "grande");
        Song song3 = new Song("camila", "cabello");
        list.add(song1);
        list.add(song2);
        list.add(song3);
        assertEquals(3, list.size());
        assertEquals(song1, list.get(0));
        assertEquals(song2, list.get(1));
        assertEquals(song3, list.get(2));
        assertFalse(list.isEmpty());
        assertEquals(song3, list.tail());
    }




}
