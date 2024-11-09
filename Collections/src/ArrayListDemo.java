// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;

public class ArrayListDemo {
   public ArrayListDemo() {
   }

   public static void main(String[] args) {
      ArrayList al = new ArrayList();
      System.out.println(al.size());
      System.out.println(al);
      al.add(10);
      al.add(20);
      al.add(10);
      al.add((Object)null);
      System.out.println(al);
      System.out.println(al.size());
      al.add("Java");
      al.add("Python");
      System.out.println(al);
      System.out.println(al.size());
      al.set(0, 100);
      System.out.println(al);
      al.add(1, 234);
      System.out.println(al);
      System.out.println(al.size());
      al.remove(0);
      System.out.println(al);
      System.out.println(al.size());
   }
}
