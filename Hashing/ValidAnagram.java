import java.util.*;

public class ValidAnagram {

  public static boolean isAnagrame(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {

      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

    }
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (map.get(ch) != null) {
        if (map.get(ch) == 1) {
          map.remove(ch);

        } else {
          map.put(ch, map.get(ch) - 1);
        }

      } else {
        return false;

      }
    }

    return map.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println("welcome to anagram");

    String s = "race";
    String t = "care";

    System.out.println(isAnagrame(s, t));
  }

}
