import java.util.*;

class InterleaveHalf {
  public static void main(String[] args) {
    System.out.println("welcome to interleav ");

    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);

    interleves(q);

    while (!q.isEmpty()) {
      System.out.println(q.remove() + " ");

    }
    System.out.println();
  }

  public static void interleves(Queue<Integer> q) {

    Queue<Integer> first = new LinkedList<>();

    int size = q.size();

    for (int i = 0; i < size / 2; i++) {

      first.add(q.remove());

    }

    while (!first.isEmpty()) {

      q.add(first.remove());
      q.add(q.remove());

    }
  }

}
