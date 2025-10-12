
public class HeigthofTree {
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

  // height of treee

  public static int height(Node root) {
    if (root == null) {
      return 0;

    }

    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }

  // count of tree
  public static int countN(Node root) {
    if (root == null) {
      return 0;

    }

    int lh = countN(root.left);
    int rh = countN(root.right);
    int treeC = lh + rh + 1;
    return treeC;
  }

  // sum of nodes
  public static int sumNodes(Node root) {
    if (root == null) {
      return 0;

    }

    int lh = sumNodes(root.left);
    int rh = sumNodes(root.right);
    int sum = lh + rh + root.data;
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("Welcomt to height of tree");

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // System.out.println("height of tree is " + height(root));
    // System.out.println("Number of nodes is " + countN(root));

    System.out.println("sum of all nodes " + sumNodes(root));

  }

}
