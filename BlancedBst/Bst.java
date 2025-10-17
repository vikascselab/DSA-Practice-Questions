
public class Bst {

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

  public static void main(String[] args) {
    System.out.println("welcome to bst");

    int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
    Node root = CreateBst(arr, 0, arr.length - 1);

    preorder(root);

  }

}
