import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueE {
  public static void main(String[] args) {
    System.out.println("welcome to priority queue");

    PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
    p.add(10);
    p.add(5);
    p.add(20);

    System.out.println("Priority Queue elements: " + p);
    // System.out.println("Head element: " + p.peek());

    while (!p.isEmpty()) {

      System.out.println(p.peek() + " ");
      p.remove();

    }
  }
}
