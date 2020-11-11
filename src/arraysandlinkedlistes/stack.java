package arraysandlinkedlistes;


public class stack <T>{
    
    // we are using our implemenation but you can use the java.util.LinkedList
    LinkedList baseList = new LinkedList();
    
    public stack(){
        
    }
    
    // if you want you cann add another cunstructor that accepte one first element.
    
    int size(){return baseList.size;}
    
    boolean isEmpty(){return baseList.size == 0;}
    
    T peek(){ if(this.isEmpty() != true){return (T) baseList.head.value;}return null;}
    
    
    void push(T value){ baseList.addAtHead(value);}
    
    T pop(){
        if (this.isEmpty() != true) {
            T pulledItem = (T) baseList.head.value;
            baseList.removeFirst();
            return pulledItem;
        }
        return null;
    }
    
    
    
}
