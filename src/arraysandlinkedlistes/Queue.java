package arraysandlinkedlistes;



public class Queue <T>{
    
    LinkedList baseList = new LinkedList();
   
    // if you want you cann add another cunstructor that accepte one first element.
    
    int size(){return baseList.size;}
    
    boolean isEmpty(){return baseList.size == 0;}
    
    T peek(){ if(this.isEmpty() != true){return (T) baseList.head.value;}return null;}
    
    
    void offer(T value){ baseList.addAtTail(value);}
    
    T poll(){
        if (this.isEmpty() != true) {
            T pulledItem = (T) baseList.head;
            baseList.removeFirst();
            return pulledItem;
        }
        return null;
    }
    
}
