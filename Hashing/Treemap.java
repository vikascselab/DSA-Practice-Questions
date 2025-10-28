import java.util.*;

public class Treemap {
  public static void main(String[] args) {
    System.out.println("welcome to linkedhash");

    // maintain the order of key

    TreeMap<String, Integer> lh = new TreeMap<>();

    lh.put("india", 100);
    lh.put("china", 10);
    lh.put("nepal", 107);

    System.out.println(lh);

    Set<String> keys = lh.keySet();

    for (String key : keys) {
      System.out.println(key);

    }

  }

}
