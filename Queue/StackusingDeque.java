import java.util.Deque;
import java.util.LinkedList;

class StackusingDeque {

  static class Queue {

    Deque<Integer> d = new LinkedList<>();

    public void push(int data) {
      d.addLast(data);
    }

    public int pop() {
      return d.removeLast();

    }

    public int peek() {
      return d.getLast();
    }
  }

  public static void main(String[] args) {
    System.out.println("welcome");

    Queue q = new Queue();

    q.push(1);
    q.push(2);
    q.push(3);

    // System.out.println(q);
    System.out.println(q.peek());
    System.out.println(q.pop());
    System.out.println(q.pop());
    System.out.println(q.pop());

  }

}
