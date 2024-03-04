package utils;

import business.Song;

import java.util.List;

/**
 *
 * @author michelle
 */
public class LinkedList {

    protected static class Node{
        private Song data;
        private Node next;

        /**
         * Constructs a new node with the given song data.
         * @param data The song to be stored in the node.
         */
        public Node(Song data){
            this.data = data;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public void setData(Song data) {
            this.data = data;
        }

        public Song getData() {
            return this.data;
        }

    }

    private Node head;
    private Node tail;
    private int songs;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        head = null;
        tail = null;
        songs = 0;
    }

    public int size(){
        return songs;
    }

    /**
     * Gets the song at the specified position in the list.
     * @param pos The position of the song to get.
     * @return The song at the specified position.
     * @throws IndexOutOfBoundsException If the position is out of range.
     */
    public Song get(int pos) throws IndexOutOfBoundsException{
        if (pos < 0 || pos >= size()){
            throw new IndexOutOfBoundsException("The " + pos + " position entered is invalid! ");
        }
        Node current = head;
        int i = 0;
        while(i<pos){
            current = current.getNext();
            i++;
        }
        return current.getData();
    }



    /**
     * Returns the index of the first occurrence of the specified song in the list,
     * or -1 if the list does not contain the song.
     * @param song The song to search for.
     * @return The index of the specified song, or -1 if not found.
     */
   public int indexOf(Song song){
       int i = 0;
       Node current = head;
       while(current!=null){
           if (current.getData().equals(song)){
               return i;
           }
           current = current.getNext();
           i++;
       }
       return -1;
   }

   /** A method called add() that takes a single parameter, a Song to be added to the end of the list. **/

    /**
     * Adds the specified song to the end of the list.
     * @param song The song to be added.
     */
   public void add(Song song) {
       Node newNode = new Node(song);
       if (head == null) {
           head = newNode;
           songs++;
       } else if (!isDuplicate(song)) {
           Node current = head;
           while (current.getNext() != null) {
               current = current.getNext();
           }
           current.setNext(newNode);
           tail = current.getNext();
           songs++;
       }
   }

   /** A method called isEmpty() that takes no parameters. This should return a boolean indicating if there is data
    currently stored in the list. **/

    /**
     * Checks if the list is empty.
     * @return True if the list is empty, false otherwise.
     */
   public boolean isEmpty(){
       if (head == null){
           return true;
       }
       else{
           return false;
       }
   }

   /**A method called tail() that takes no parameters. This should return the last element in the list.**/

    /**
     * Returns the last element in the list.
     * @return The last song in the list, or null if the list is empty.
     */
   public Song tail(){
       if (head == null){
           return null;
       }
       else{
           Node current = head;
           while (current.getNext() != null) {
               current = current.getNext();
           }
           tail = current;
           return current.getData();
       }
   }

    /**
     * Checks if the specified song exists in the list.
     * @param song The song to check for duplication.
     * @return True if the song exists in the list, false otherwise.
     */
    public boolean isDuplicate(Song song){
        Node current = head;
        while(current != null){
            if (current.getData().equals(song)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    /**
     * Removes all occurrences of the specified song from the list.
     * @param song The song to be removed.
     * @return True if the song was removed, false otherwise.
     */
    public boolean removeAll(Song song) {
        if (song == null || isEmpty()) {
            return false;
        }

        boolean flag = false;

        while (head != null && head.getData().equals(song)) {
            head = head.getNext();
            flag = true;
            songs--;
        }

        Node current = head;
        while (current != null && current.getNext() != null) {
            if (current.getNext().getData().equals(song)) {
                current.setNext(current.getNext().getNext());
                flag = true;
                songs--;
            } else {
                current = current.getNext();
            }
        }

        return flag;
    }





}
