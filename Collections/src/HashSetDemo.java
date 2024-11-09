// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.HashSet;

public class HashSetDemo {
   public HashSetDemo() {
   }

   public static void main(String[] args) {
      HashSet<Integer> s = new HashSet<Integer>();
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
      s.remove(100);
      System.out.println(s);
   }
}
