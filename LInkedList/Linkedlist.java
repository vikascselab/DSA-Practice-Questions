public class Linkedlist {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newnode;
      return; // important
    }

    newnode.next = head;
    head = newnode;
  }

  public void addLast(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newnode;
      return;
    }

    tail.next = newnode;
    tail = newnode;
  }

  public void print() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void add(int idx, int data) {

    if (idx == 0) {

      addFirst(data);
      return;

    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;

    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;

    }

    newNode.next = temp.next;
    temp.next = newNode;

  }

  public int removeFirst() {

    if (size == 0) {
      System.out.println("LL is empty");

      return Integer.MIN_VALUE;

    } else if (size == 1) {
      int val = head.data;

      head = tail = null;
      size = 0;
      return val;

    }
    int val = head.data;

    head = head.next;
    size--;
    return val;
  }

  public int removelast() {
    if (size == 0) {

      System.out.println(" ll is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {

      int val = head.data;
      head = tail = null;

      return val;

    }

    Node prev = head;

    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;

    }

    int val = prev.next.data;

    prev.next = null;

    tail = prev;

    size--;

    return val;

  }

  public static void main(String[] args) {
    System.out.println("Welcome to LinkedList");
    Linkedlist ll = new Linkedlist();

    ll.addFirst(1);

    ll.addFirst(2);

    ll.addLast(3);

    ll.addLast(4);

    ll.add(2, 7);
    ll.removeFirst();
    ll.print();
    ll.removelast();
    ll.print();

    // System.out.println(ll.size);
  }
}
