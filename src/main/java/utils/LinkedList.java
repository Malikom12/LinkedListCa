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

    public LinkedList() {
        head = null;
        tail = null;
        songs = 0;
    }

    public int size(){
        return songs;
    }

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



}
