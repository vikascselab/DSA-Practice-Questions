import java.util.*;

class QueueCollection {

  public static void main(String[] args) {
    System.out.println("welcome");

    Queue<Integer> q = new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();

    }

  }
}
