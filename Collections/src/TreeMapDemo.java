// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
   public TreeMapDemo() {
   }

   public static void main(String[] args) {
      TreeMap<Integer, String> hm = new TreeMap();
      hm.put(1001, "sai@gmail.com");
      hm.put(1004, "abc@gmail.com");
      hm.put(1002, "sms@gmail.com");
      hm.put(1003, "lr@gmail.com");
      System.out.println(hm);
      hm.put(1002, "ps123@gmail.com");
      System.out.println(hm);
      System.out.println(hm.keySet());
      Set<Integer> keys = hm.keySet();
      System.out.println(keys);
      Collection<String> values = hm.values();
      System.out.println(values);
      Iterator var5 = hm.entrySet().iterator();

      while(var5.hasNext()) {
         Map.Entry<Integer, String> entry = (Map.Entry)var5.next();
         System.out.println(entry);
         PrintStream var10000 = System.out;
         String var10001 = String.valueOf(entry.getKey());
         var10000.println(var10001 + "---------" + (String)entry.getValue());
      }

   }
}
