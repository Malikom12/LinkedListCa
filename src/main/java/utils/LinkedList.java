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


   /** A method called indexOf() that takes one parameter, a Song to be found in the list. The method should
return an int indicating the position at which the Song could be found. If the Song could not be found, an
    appropriate value should be returned to indicate this **/

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

   public void add(Song song) {
       if (!isDuplicate(song)){
           Node newNode = new Node(song);
           if (head == null) {
               head = newNode;
           } else {
               Node current = head;
               while (current.getNext() != null) {
                   current = current.getNext();
               }
               current.setNext(newNode);
           }
           songs++;
       }
   }

   /** A method called isEmpty() that takes no parameters. This should return a boolean indicating if there is data
    currently stored in the list. **/

   public boolean isEmpty(){
       if (head == null){
           return true;
       }
       else{
           return false;
       }
   }

   /**A method called tail() that takes no parameters. This should return the last element in the list.**/

   public Song tail(){
       if (head == null){
           return null;
       }
       else{
           Node current = head;
           while (current.getNext() != null) {
               current = current.getNext();
           }
           return current.getData();
       }
   }

   public boolean isDuplicate(Song song){
           Node current = head;
           while(current!=null){
               if (current.getData().equals(song)){
                   return true;
               }
               current = current.getNext();
           }
       return false;
   }




}
