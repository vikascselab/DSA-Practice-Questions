import java.util.LinkedHashSet;

public class linkedhashset {
  public static void main(String[] args) {
    System.out.println("welcome to hashset");

    LinkedHashSet<String> lsh = new LinkedHashSet<>();
    lsh.add("delhi");
    lsh.add("basti");
    lsh.add("pune");
    lsh.add("noida");
    // maintain insertion order

    System.out.println(lsh);

  }

}
