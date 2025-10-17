import java.util.*;

public class bsttobalensed {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  // preorder
  public static void preorder(Node root) {

    if (root == null) {
      return;

    }
    System.out.println(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  // bst creation
  public static Node CreateBst(int[] arr, int st, int end) {
    if (st > end) {
      return null;
    }

    int mid = (st + end) / 2;

    Node root = new Node(arr[mid]);
    root.left = CreateBst(arr, st, mid - 1);
    root.right = CreateBst(arr, mid + 1, end);

    return root;
  }

  // get inorder

  public static void getIorder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;

    }
    getIorder(root.left, inorder);
    inorder.add(root.data);
    getIorder(root.right, inorder);
  }

  // Crete bst using array list
  public static Node Create2Bst(ArrayList<Integer> inord, int st, int end) {
    if (st > end) {
      return null;
    }

    int mid = (st + end) / 2;

    Node root = new Node(inord.get(mid));
    root.left = Create2Bst(inord, st, mid - 1);
    root.right = Create2Bst(inord, mid + 1, end);

    return root;
  }

  // balanced bst

  public static Node balancedBst(Node root) {
    ArrayList<Integer> inorder = new ArrayList<>();

    // inorder
    getIorder(root, inorder);

    // sorted to balanced

    root = Create2Bst(inorder, 0, inorder.size() - 1);
    return root;

  }

  public static void main(String[] args) {
    System.out.println("welcome to bst");

    // int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
    // Node root = CreateBst(arr, 0, arr.length - 1);

    // preorder(root);

    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);

    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);

    root = balancedBst(root);
    preorder(root);

  }

}
