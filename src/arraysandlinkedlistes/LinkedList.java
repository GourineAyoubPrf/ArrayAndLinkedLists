package arraysandlinkedlistes;

import java.util.Iterator;


public class LinkedList <T> implements Iterable{

    public class Node <T>{
        T value;
        Node next;
        
        public Node(T value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    
    Node head;
    int size = 0;
    
    public LinkedList(){
        this.head = null;
    }
    
    void addAtHead(T value){
        if (size == 0) {
            this.head = new Node(value,null);
        }else{
            Node newNode = new Node(value,this.head);
            this.head = newNode;
        }
        size++;
    }
    
    void addAtTail(T value){
        if (size == 0) {
            this.head = new Node(value,null);
        }else{
            Node pointer = this.head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            Node newNode = new Node(value,null);
            pointer.next = newNode;
            
        }
        size++;
    
    }
    
    void addAtIndex(T value, int index){
        
        Node pointer = this.head;
        int counter = 0;
        if (index < size){     
            while (counter < index) {            
                pointer = pointer.next;
                counter++;
            }
            Node newNode = new Node(value,pointer.next);
            pointer.next = newNode;
        }
        
        
    }
    
    void removeFirst(){
        if (size > 0) {
            if (size == 1) {
                this.head = null;
            }else{
                Node tmp = this.head.next;
                this.head = tmp;
            }
            this.size--;
        }
  
    }
    
    void removeLast(){
        if (size > 0) {
            if (size == 1) {
                this.head = null;
            }else{
                Node pointer = this.head;
                while (pointer.next.next != null) {                    
                    pointer = pointer.next;
                }
                pointer.next = null;
            }
            this.size--;
        }
    }
    
    void removeAtIndex(int index){
    
        if (size > 0 && index < size) {
            Node pointer = this.head;
            int counter = 0;
            while (counter < index) {  
                pointer = pointer.next;
                counter++;
            }
            pointer.next = pointer.next.next;
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
        
    }
    
    
    
     @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
