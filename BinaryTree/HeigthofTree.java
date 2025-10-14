/// this is most important fot baic understanding
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

  // diameter of tree

  public static int diameter2(Node root) {
    if (root == null) {
      return 0;

    }

    int leftD = diameter2(root.left);
    int leftH = height(root.left);
    int righD = diameter2(root.right);
    int righH = height(root.right);

    int selfD = leftH + righH + 1;

    return Math.max(selfD, Math.max(righD, leftD));
  }

  static class info {
    int dia;
    int ht;

    public info(int dia, int ht) {
      this.dia = dia;
      this.ht = ht;

    }

  }

  public static info diameter(Node root) {
    if (root == null) {
      return new info(0, 0);

    }
    info leftinfo = diameter(root.left);
    info rightinfo = diameter(root.left);

    int dia = Math.max(Math.max(rightinfo.dia, leftinfo.dia), rightinfo.ht + leftinfo.ht + 1);

    int ht = Math.max(rightinfo.ht, leftinfo.ht) + 1;

    return new info(dia, ht);

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
    // System.out.println("diameter of tree is " + diameter2(root));
    // System.out.println(diameter(root).dia);
  }

}
