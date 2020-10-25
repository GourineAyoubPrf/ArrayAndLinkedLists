package arraysandlinkedlistes;


public class ArraysAndLinkedListes {

  
    public static void main(String[] args) {
        
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtHead(5);
        linkedList.addAtTail(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(1000,2);
        linkedList.addAtHead(16);
        linkedList.removeLast();
        System.out.println("/////////////");
        linkedList.printList();
        linkedList.removeLast();
        System.out.println("/////////////");
        linkedList.printList();
        linkedList.removeLast();
        System.out.println("/////////////");
        linkedList.printList();
        linkedList.removeLast();
        System.out.println("/////////////");
        linkedList.printList();
        linkedList.removeLast();
        System.out.println("/////////////");
        linkedList.printList();
        linkedList.addAtHead(5);
       // System.out.println("seacrh result " + linkedList.search(5));
       
       
    }
    
}
