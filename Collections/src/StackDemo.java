// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Stack;

public class StackDemo {
   public StackDemo() {
   }

   public static void main(String[] args) {
      Stack<String> names = new Stack();
      names.push("Java");
      names.push("Python");
      names.push("Angular");
      System.out.println(names);
      System.out.println((String)names.peek());
      names.pop();
      System.out.println(names);
   }
}
