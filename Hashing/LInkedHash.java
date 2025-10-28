import java.util.*;

public class LInkedHash {
  public static void main(String[] args) {
    System.out.println("welcome to linkedhash");

    // maintain the order of key

    LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();

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
