// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversalDemo {
   public TraversalDemo() {
   }

   public static void main(String[] args) {
      ArrayList<Double> salaries = new ArrayList();
      salaries.add(55000.0);
      salaries.add(35000.0);
      salaries.add(65000.0);
      salaries.add(85000.0);
      salaries.add(25000.0);
      System.out.println(salaries);
      System.out.println(" Using For loop");

      for(int index = 0; index < salaries.size(); ++index) {
         System.out.println(salaries);
      }

      System.out.println(" Using ListIterator from 1.2");
      ListIterator<Double> itr = salaries.listIterator();

      while(itr.hasNext()) {
         System.out.println(itr.next());
      }

      System.out.println(" Using ListIterator from 1.5");
      Iterator var4 = salaries.iterator();

      while(var4.hasNext()) {
         Double salary = (Double)var4.next();
         System.out.println(salary);
      }

      System.out.println(" Using foreach() from v1.8 with Method References");
      PrintStream var10001 = System.out;
      salaries.forEach(var10001::println);
      System.out.println(" Using foreach() from v1.8 with Lambda Expressions");
      salaries.forEach((salaryx) -> {
         System.out.println(salaryx);
      });
   }
}
