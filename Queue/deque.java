import java.util.*;

class deque {
  public static void main(String[] args) {
    System.out.println("welcome to deque");

    Deque<Integer> d = new LinkedList<>();
    d.addFirst(1);
    d.addFirst(2);
    d.addFirst(3);

    System.out.println(d);
  }

}
