
package arraysandlinkedlistes;

import java.util.Iterator;


public class DoubleLinkedList <T> implements Iterable {  
    
    private class Node <T>{
        T value;
        Node next;
        Node before;
        
        public Node(T value, Node before, Node next){
            this.value = value;
            this.before = before;
            this.next = next;
        }
    }
    
    Node head;
    Node tail;
    int size = 0;
    
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    void addAtHead(T value){
        if (size == 0) {
            this.head =  this.tail = new Node(value,null,null);
            
        }else{
            Node newNode = new Node(value,null,this.head);
            this.head.before = newNode;
            this.head = newNode;
        }
        size++;
    }
    
    void addAtTail(T value){
        if (size == 0) {
            this.head = this.tail =  new Node(value,null,null);
        }else{
            Node newNode = new Node(value,this.tail,null);
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
    
    }
    
    void addAtIndex(T value, int index){
        
        Node pointer = this.head;
        int counter = 0;
        if (index < size){     
            if (index == size - 1) {
                this.addAtTail(value);
            }else{
            while (counter < index-1) {            
                pointer = pointer.next;
                counter++;
            }
            Node newNode = new Node(value,pointer, pointer.next);
            pointer.next.before = newNode;
            pointer.next = newNode;
            }
        }
        size++;
        
    }
    
    void removeFirst(){
        if (size > 0) {
            this.head = this.head.next;
            this.size--;
            if (this.head == null) {
                this.tail = null;
            }else{
                this.head.before = null;
            }
        }
  
    }
    
    void removeLast(){
        
        if (size > 0) { 
            this.tail = this.tail.before;
            this.size--;
            if (this.tail == null) {
                this.head = null;
            }else{
                this.tail.next = null;
            }
        }
    }
    
    void removeAtIndex(int index){
    
        if (size > 0 && index < size) {
            if (index == size) {
                removeLast();
            }else{
            Node pointer = this.head;
            int counter = 0;
            while (counter < index) {  
                pointer = pointer.next;
                counter++;
            }
            pointer.before.next = pointer.next;
            }
            this.size--;
        }
    }
    
    boolean search(T value){
        if (size > 0) {
            Node pointer = this.head;
            while (pointer != null) {                
                if (pointer.value.equals(value)) {
                    return true;
                }
                pointer = pointer.next;
            }
            return false;
            
        }else{
            return false;
        }
    }
    
    void clear(){
        
        Node pointer = this.head;
        while (pointer.next != null) {    
            pointer.value = null;
            pointer = pointer.next;
        }
        this.head = null;
    }
    
    void printList(){
    
        Node pointer = this.head;
        while(pointer != null){
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }
        System.out.println(" ");
        
    }
    
      @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
