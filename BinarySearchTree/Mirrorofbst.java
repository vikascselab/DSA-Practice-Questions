class Mirrorofbst {

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static Node creatMirror(Node root) {
    if (root == null) {
      return null;

    }

    Node leftMirror = creatMirror(root.left);
    Node rightMirror = creatMirror(root.right);

    root.left = rightMirror;

    root.right = leftMirror;
    return root;

  }
  // pre order

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.println(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {
    System.out.println("welcome to bst of mirror");

    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.right = new Node(11);

    root = creatMirror(root);
    preorder(root);

  }

}
