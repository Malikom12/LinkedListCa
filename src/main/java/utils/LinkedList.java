package utils;

import business.Song;

import java.util.List;

/**
 *
 * @author michelle
 */
public class LinkedList {

    protected static class Node{
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

    }

    private Node head;
    private Node tail;
    private int size;



}
