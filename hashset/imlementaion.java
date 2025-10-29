import java.util.*;

public class imlementaion {

  public static void main(String[] args) {
    System.out.println("welcome to hashset ");

    HashSet<Integer> hs = new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(4);
    hs.add(2);
    hs.add(1);
    System.out.println(hs);
    // hs.remove(2);
    // if (hs.contains(2)) {
    // System.out.println("set conaians 2");

    // } else {
    // System.out.println("set not contains 2");
    // }

    // System.out.println(hs.size());
    // System.out.println(hs.isEmpty());
    // iterator
    // @SuppressWarnings("rawtypes")
    // Iterator it = hs.iterator();
    // while (it.hasNext()) {
    // System.out.println(it.next());

    // }
    // for each loop
    for (Integer integer : hs) {
      System.out.println(integer);

    }

  }
}
