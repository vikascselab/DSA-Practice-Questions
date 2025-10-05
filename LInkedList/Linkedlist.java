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

  public int itsearch(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {

      if (temp.data == key) {

        return i;

      }

      temp = temp.next;
      i++;

    }
    return -1;
  }

  // helping for finding recursive search
  public int helper(Node head, int key) {

    if (head == null) {
      return -1;
    }

    if (head.data == key) {

      return 0;

    }

    int idx = helper(head.next, key);

    if (idx == -1) {
      return -1;

    }

    return idx + 1;

  }

  //// recursive search

  public int reSearch(int key) {

    return helper(head, key);
  }

  public void reverse() {
    Node pre = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {

      next = curr.next;
      curr.next = pre;

      pre = curr;
      curr = next;

    }

    head = pre;
  }

  // deletin from last

  public void deleteNthfromend(int n) {
    // calculate xize

    int sz = 0;

    Node temp = head;
    while (temp != null) {

      temp = temp.next;
      sz++;

    }

    if (n == sz) {

      head = head.next; // this is my remove first opretaion
      return;

    }

    // sz-1

    int i = 1;
    int tofind = sz - n;

    Node pre = head;
    while (i < tofind) {

      pre = pre.next;
      i++;

    }

    pre.next = pre.next.next;

  }

  // find palindrome
  /// slow fast apporach and helper function
  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next == null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow; // slow is my midnode

  }

  public boolean isPalindrome() {

    if (head == null || head.next == null) {

      return true;

    }

    // find mid

    Node midnode = findMid(head);

    Node pre = null;
    Node curr = midnode;
    Node next;

    // find reverse 2nd half

    while (curr != null) {

      next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;

    }

    Node right = pre; // right half head

    Node left = head;

    // check first half and right half

    while (right != null) {
      if (left.data != right.data) {

        return false;

      }

      left = left.next;
      right = right.next;

    }

    return true;
  }

  public static boolean iscycle() {

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {

        return true;

      }
    }
    return false;

  }

  // looop removing

  public static void removeCycle() {
    // detect cycle

    Node slow = head;
    Node fast = head;

    boolean cycle = false;

    while (fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {

        cycle = true;
        break;

      }

    }

    if (cycle == false) {
      return;
    }

    // finding meting point

    slow = head;
    Node prev = null;// sotore last node
    while (slow != fast) {

      prev = fast;
      slow = slow.next;
      fast = fast.next;

    }

    // removing cycle

    prev.next = null;
  }

  // finding mid
  public static Node getMid(Node head) {

    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

    }
    return slow; // mid node

  }

  // merge function

  private static Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;

      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }

    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;

    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;

    }

    return mergedLL.next;

  }

  //// merge sort
  public static Node mergeSort(Node head) {

    // find mid
    Node mid = getMid(head);

    if (head == null || head.next == null) {
      return head;

    }

    // left and right ms

    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    // merge

    return merge(newLeft, newRight);

  }

  /// zig zag
  public void zigZag() {
    // find mid

    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;

    }
    Node mid = slow;

    // reverse of 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    // alt- merge-- zig zag merge
    while (left != null && right != null) {

      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;

    }

  }

  public static void main(String[] args) {
    System.out.println("Welcome to LinkedList");

    Linkedlist ll = new Linkedlist();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();
    // ll.head = mergeSort(ll.head);
    ll.zigZag();
    ll.print();
    // head = new Node(1);

    // Node temp = new Node(2);

    // head.next = temp;

    // head.next.next = new Node(3);
    // head.next.next.next = temp;

    // System.out.println(iscycle());

    // Linkedlist ll = new Linkedlist();

    // ll.addFirst(5);

    // ll.addFirst(2);

    // ll.addLast(2);

    // ll.addLast(1);

    // ll.add(2, 7);
    // ll.removeFirst();
    // ll.print();
    // ll.removelast();
    // ll.print();

    // System.out.println(ll.isPalindrome());

    // System.out.println(ll.reSearch(8));
    // System.out.println(ll.reSearch(3));

    // ll.reverse();

    // ll.deleteNthfromend(3);
    // ll.print();
    // System.out.println(ll.size);

    // System.out.println(head);
    // System.out.println(head.next);

    // System.out.println(iscycle());
    // removeCycle();
    // System.out.println(iscycle());
  }
}
