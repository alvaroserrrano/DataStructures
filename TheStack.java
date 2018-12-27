/*PROJECT:  
 *AUTHOR:  $(user)
 *DESCRIPTION:  
  *****************************************************************************/
package thestack;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1; //set array as empty

    TheStack(int size) {     //CONSTRUCTOR
        stackArray = new String[size];
        stackSize = size;

        //Assign -1 to every value in the array
        //so I can control what gets printed to screen
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            System.out.println("Sorry But the Stack is Full");
        }
        displayTheStack();

        System.out.println("PUSH " + input + " Was added to the stack");
    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was removed"
                    + " from the Stack \n");
            stackArray[topOfStack] = "-1";//Assigns -1 so the value won´t appear
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry but the Stack ins empty");
            return "-1";
        }

    }//meth
    
    public String peek(){
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the top "
                + "of the Stack \n");
        return stackArray[topOfStack];
    }
    
    public void pushMany(String multipleValues){
        String[]tempString = multipleValues.split(" ");
        for(int i = 0; i<tempString.length; i++){
            push(tempString[i]);
        }
    }
    
    public void popAll(){
        for(int i = topOfStack; i >= 0; i--){
            pop();
        }
    }
    
    public void popDisplayAll(){
        String theReverse = "";
        for (int i = topOfStack; i >= 0; i--){
            theReverse += stackArray[i];
        }
        System.out.println("The Reverse: " + theReverse);
        popAll();

    }
    

    public void displayTheStack() {
        for (int i = 0; i < 61; i++) {
            System.out.println("-");
        }
        for (int i = 0; i < stackSize; i++) {
            System.out.format("| %2s " + " ", i);
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < stackSize; i++) {
            if (stackArray[i].equals("-1")) {
                System.out.print("|     ");
            } else {
                System.out.print(String.format("| %2s " + " ", stackArray[i]));
            }
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

    }//meth

    public static void main(String[] args) {

        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("17");
        theStack.push("13");
        
        //See value on top
        theStack.peek();
        
        //remove values from Stack
        theStack.pop();
        theStack.pop();
        theStack.pop();

        //add many to the stack
        theStack.pushMany(" R E D R U M");
        
        //remove all from the stacl
        //theStack.popAll();
        
        //remove all from stack and print them
        theStack.popDisplayAll();
        theStack.displayTheStack();
    }//main
}//class TheStack
