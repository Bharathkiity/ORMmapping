// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
   public LinkedHashSetDemo() {
   }

   public static void main(String[] args) {
      LinkedHashSet<Integer> s = new LinkedHashSet();
      s.add(100);
      s.add(200);
      s.add(300);
      s.add(400);
      s.add(500);
      System.out.println(s);
      s.add(500);
      System.out.println(s);
      s.add((Integer)null);
      System.out.println(s);
      boolean existed = s.contains(158);
      System.out.println(existed);
      System.out.println(s.isEmpty());
      s.addFirst(123);
      s.addLast(232);
      System.out.println(s);
      s.removeFirst();
      System.out.println(s);
      s.removeLast();
      System.out.println(s);
   }
}
