import java.util.LinkedList;

class collection {

  public static void main(String[] args) {
    System.out.println("Welcome to Linked list collection frame work");

    LinkedList<Integer> ll = new LinkedList<>();
    ll.addLast(2);
    ll.addLast(3);
    ll.addFirst(1);

    System.out.println(ll);
  }

}
