import java.util.ArrayList;

public class StackusingLinkedlist {
  // this is Linked list node
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {
    static Node head = null;

    public static boolean isempty() {
      return head == null;
    }

    /// push function
    public static void push(int data) {
      Node newNode = new Node(data);
      if (isempty()) {
        head = newNode;
        return;

      }

      newNode.next = head;
      head = newNode;
    }

    // pop

    public static int pop() {
      if (isempty()) {
        return -1;

      }
      int top = head.data;
      head = head.next;
      return top;

    }

    // peek

    public static int peek() {
      if (isempty()) {
        return -1;

      }

      int top = head.data;
      return top;
    }

  }

  public static void main(String[] args) {
    System.out.println("welcome to stack using array list");

    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isempty()) {
      System.out.println(s.peek());
      s.pop();

    }

  }

}
