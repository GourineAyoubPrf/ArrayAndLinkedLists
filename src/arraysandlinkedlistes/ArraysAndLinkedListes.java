package arraysandlinkedlistes;


public class ArraysAndLinkedListes {
    
    static String getComp(String character){
        
        switch(character){
            case "{" : return "}";
            case "[" : return "]";
            case "(" : return ")";
            default : return "";
        }
    }
    
    static boolean balancedBracketsProblem (String input) {
        
        stack myStack = new stack();
        for (int index = 0; index < input.length(); index++) {
            if (myStack.isEmpty() == false) {
                if (String.valueOf(input.charAt(index)).equals(getComp(myStack.pop().toString()))) {
                    myStack.pop();
                }
            }else{
                myStack.push(input.charAt(index));
            }
        }
        if (myStack.isEmpty() == true) {
            return true ;
        }else{
            return false;
        }
        
    }

  
    public static void main(String[] args) {
        
       /* stack myStack = new stack();
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        System.err.println(myStack.peek());
        myStack.pop();
        System.err.println(myStack.peek());
        System.err.println(myStack.size());*/
        
        System.err.println("result is  : " + balancedBracketsProblem("({{}{[]}{[]}{}})") );
        
    
       // System.out.println("seacrh result " + linkedList.search(5));
       
       
    }
    
}
