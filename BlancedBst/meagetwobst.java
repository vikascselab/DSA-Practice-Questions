import java.util.ArrayList;

public class meagetwobst {

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
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

  public static void getIorder(Node root, ArrayList<Integer> arr) {

    if (root == null) {
      return;

    }

    getIorder(root.left, arr);
    arr.add(root.data);
    getIorder(root.right, arr);
  }

  // build bst

  public static Node CreateBst(ArrayList<Integer> arr, int st, int end) {
    if (st > end) {
      return null;
    }

    int mid = (st + end) / 2;

    Node root = new Node(arr.get(mid));
    root.left = CreateBst(arr, st, mid - 1);
    root.right = CreateBst(arr, mid + 1, end);

    return root;
  }

  public static Node mergeTwobst(Node root1, Node root2) {
    // get inorder fro1

    ArrayList<Integer> arr1 = new ArrayList<>();

    getIorder(root1, arr1);

    // get inorder fro 2
    ArrayList<Integer> arr2 = new ArrayList<>();
    getIorder(root2, arr2);

    // merge

    int i = 0;
    int j = 0;

    ArrayList<Integer> finalarray = new ArrayList<>();

    while (i < arr1.size() && j < arr2.size()) {

      if (arr1.get(i) < arr2.get(j)) {
        finalarray.add(arr1.get(i));
        i++;

      } else {
        finalarray.add(arr2.get(j));
        j++;
      }

    }

    // bacha kucha

    while (i < arr1.size()) {
      finalarray.add(arr1.get(i));
      i++;

    }
    while (j < arr2.size()) {
      finalarray.add(arr2.get(j));
      j++;

    }

    // build bst

    int st = 0;
    int end = finalarray.size() - 1;

    Node root = CreateBst(finalarray, st, end);
    return root;

  }

  public static void main(String[] args) {
    System.out.println("welcomee to mearge two bst");

    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    // rooot 2

    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);

    Node root = mergeTwobst(root1, root2);
    preorder(root);

  }
}
