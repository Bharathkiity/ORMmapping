// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;

public class ArrayListDemo2 {
   public ArrayListDemo2() {
   }

   public static void main(String[] args) {
      ArrayList all = new ArrayList();
      all.add(100);
      all.add(200);
      all.add("abc");
      all.add(12.5);
      System.out.println(all);
      Object obj = all.get(0);
      int i = (Integer)obj;
      System.out.println(i);
      ArrayList<String> courses = new ArrayList();
      courses.add("java");
      courses.add("Python");
      System.out.println(courses);
      String course = (String)courses.get(1);
      System.out.println(course);
   }
}
