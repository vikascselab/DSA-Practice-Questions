import java.util.*;

public class finditinerarytickets {

  public static String Start(HashMap<String, String> tickets) {
    HashMap<String, String> revMap = new HashMap<>();

    for (String key : tickets.keySet()) {
      revMap.put(tickets.get(key), key);
    }

    for (String key : tickets.keySet()) {
      if (!revMap.containsKey(key)) {
        return key;

      }

    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println("welcome to tickets");

    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("Chennai", "Benguloru");
    tickets.put("Mumbai", "Delhi");
    tickets.put("Goa", "Chennai");
    tickets.put("Delhi", "Goa");

    String start = Start(tickets);
    System.out.println(start);

    for (String key : tickets.keySet()) {
      System.out.print("->" + tickets.get(start));

      start = tickets.get(start);

    }
    System.out.println();
  }

}
