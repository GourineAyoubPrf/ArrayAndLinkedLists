
package arraysandlinkedlistes;


public class dynamicArrays <T>{
    
    private T ininitalArray [];
    int size;
    int itemNumber = 0;
    
    public dynamicArrays(int size){
        ininitalArray = (T[]) new Object[size];
        this.size = size;
    }
    
    public dynamicArrays(){
        ininitalArray = (T[]) new Object[10];
        this.size = 10;
    }
    
    public int size(){return this.size;}
    
    public void clear(){
        for (int index = 0; index < size ; index++) {
            ininitalArray[index] = null;
        }
        this.size = 0;
        this.itemNumber = 0;
    }
    
    public T get(int index){return ininitalArray[index];}
    
    public void set(int index, T value){ ininitalArray[index] = value;}
    
    public void add(T value){
        
        if (itemNumber + 1 >= size) {
            size = size * 2;
            T[] newArray = (T[]) new Object[size];
            // copy the elements of the array to the new array.
            for (int index = 0; index < itemNumber; index++) {
                newArray[index] = ininitalArray[index];
            }
            ininitalArray = newArray;
        } 
        ininitalArray[itemNumber + 1] = value;
        itemNumber++;
    }
    
    public void remove(int index){
        
        if (size > 0) {
            T[] newArray = (T[]) new Object[itemNumber-1]; 
            // copy the element to the new array.
            for (int i = 0,j=0; i < itemNumber; i++,j++) {
                if (i == index) {
                    // skip if the lement is the one that we should delete
                    j--;
                }else{
                    newArray[j] = ininitalArray[i];
                }
            }
            ininitalArray = newArray;
            itemNumber--;
        } 
    }
    
    
    
    
    
    
}
