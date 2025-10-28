import java.util.*;

public class hash {
  public static void main(String[] args) {
    System.out.println("welcome to hash world ");

    HashMap<String, Integer> hm = new HashMap<>();

    hm.put("india", 100);
    hm.put("china", 138);
    hm.put("basti", 139);
    hm.put("bhutan", 170);
    // insertion element
    // System.out.println(hm);

    // get element

    // int population = hm.get("india");
    // System.out.println(population);

    // contain key

    // System.out.println(hm.containsKey("payal"));
    // System.out.println(hm.containsKey("india"));

    // System.out.println(hm.remove("india"));
    // System.out.println(hm);

    // System.out.println(hm.size());

    // System.out.println(hm.isEmpty());

    Set<String> keys = hm.keySet();

    System.out.println(keys);
    for (String k : keys) {
      System.out.println(hm.get(k));

    }
  }

}
