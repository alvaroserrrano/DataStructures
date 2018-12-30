/*PROJECT:  
 *AUTHOR:  $(user)
 *DESCRIPTION:  
  *****************************************************************************/
package thestack;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack;

    TheStack(int size) {
        stackArray = new String[size];
        stackSize = size;
        //Assign -1 to every value
        //to control what gets printed
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            System.out.println("Stack is full\n");
        }
        displayTheStack();
        System.out.println("PUSH: " + input + " Was added to the Stack\n");
    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("POP: " + stackArray[topOfStack] + " "
                    + "Was removed from the Stack\n");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry but the Stack is empty\n");
            return "-1";
        }
    }

    public String peek() {
        displayTheStack();
        System.out.println("PEEK: " + stackArray[topOfStack] + " "
                + "Is at the top of the Stack \n");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");
        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void popAll() {
        for (int i = 0; i < topOfStack; i++) {
            pop();
        }
    }

    public void popDisplayAll() {
        String theReverse = "";
        for (int i = topOfStack; i >= 0; i--) {
            theReverse += stackArray[i];
        }
        System.out.println("The reverse: " + theReverse);
        popAll();
    }

    public void displayTheStack() {

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            if (stackArray[n].equals("-1")) {
                System.out.print("|     ");
            } else {
                System.out.print(String.format("| %2s " + " ", stackArray[n]));
            }

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

    }

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
    }

}
