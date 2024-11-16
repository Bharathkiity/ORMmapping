public class Stack {   
     int stackArray[] =new int[5];
     int top=0;
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = value; 
            System.out.println(value);
        }
    }
  
    
    public int pop(int i) {
        if (isEmpty()) {
            System.out.println("Stack Underflow" );
            return -1; 
        } else {
            int poppedValue = stackArray[top--]; 
            System.out.println(poppedValue);
            return poppedValue;
        }
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot perform peek operation");
            return -1;
        } else {
            return stackArray[top];
        }
    }

   
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == top - 1);
    }
}
