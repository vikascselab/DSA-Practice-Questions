class TreeVikrant {

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

  static class Binarytree {
    static int idx = -1;

    public static Node buildTree(int[] nodes) {
      idx++;
      if (nodes[idx] == -1) {
        return null;

      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }

  }

  public static void main(String[] args) {
    System.out.println("welcome to binary tree");

    int nodes[] = { 2, 3, 4, -1, -1, 5, -1, -1, 6, 7, -1, -1, 8, -1, -1 };

    Binarytree tree = new Binarytree();
    Node root = tree.buildTree(nodes);

    System.out.println(root.data);

  }
}
