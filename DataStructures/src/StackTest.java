public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(); // Creating a stack of size 5
        stack.push(10); 
        stack.push(20); 
        stack.push(30);
        System.out.println(stack.peek()); 

        System.out.println("top most element is:"+stack.peek());

        stack.pop(10); 
         
       


    }
}
