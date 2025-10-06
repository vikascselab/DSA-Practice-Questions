import java.util.*;

public class StackUsColl {

  public static void main(String[] args) {
    System.out.println("welcome to stack using array list");

    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();

    }

  }

}
