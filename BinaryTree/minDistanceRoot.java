import java.util.ArrayList;

class minDistanceRoot {

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

  public static Node lca2(Node root, int n1, int n2) {

    if (root == null) {
      return null;

    }
    if (root.data == 1 || root.data == n2) {

      return root;

    }

    Node leftlaca = lca2(root.left, n1, n2);
    Node rigthlaca = lca2(root.right, n1, n2);

    if (rigthlaca == null) {
      return leftlaca;

    }
    if (leftlaca == null) {
      return rigthlaca;
    }

    return root;
  }

  public static boolean getpath(Node root, int n, ArrayList<Node> path) {

    if (root == null) {
      return false;

    }
    path.add(root);

    if (root.data == n) {
      return true;

    }

    boolean foundleft = getpath(root.left, n, path);
    boolean foundright = getpath(root.right, n, path);

    if (foundleft || foundright) {
      return true;

    }

    // remove
    path.remove(path.size() - 1);
    return false;

  }

  public static Node lca(Node root, int n1, int n2) {

    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    getpath(root, n1, path1);
    getpath(root, n2, path2);

    int i = 0;
    for (; i < path1.size() && i < path2.size(); i++) {

      if (path1.get(i) != path2.get(i)) {
        break;
      }

    }
    // my lca is
    Node lca = path1.get(i - 1);

    return lca;
  }

  // calculate diatance

  public static int lcadist(Node root, int n) {
    if (root == null) {
      return -1;

    }

    if (root.data == n) {
      return 0;
    }

    int leftdist = lcadist(root.left, n);
    int rightdist = lcadist(root.right, n);

    if (leftdist == -1 && rightdist == -1) {
      return -1;

    } else if (leftdist == -1) {
      return rightdist + 1;

    } else {
      return leftdist + 1;
    }
  }

  public static int minDist(Node root, int n1, int n2) {
    Node lc = lca(root, n1, n2);
    int dist1 = lcadist(lc, n1);
    int dist2 = lcadist(lc, n2);

    return dist1 + dist2;

  }

  // kth ancestor of node
  public static int knthancestor(Node root, int n, int k) {
    if (root == null) {

      return -1;
    }

    if (root.data == k) {
      return 0;
    }
    int leftd = knthancestor(root.left, n, k);
    int rigthtd = knthancestor(root.right, n, k);

    if (leftd == -1 && rigthtd == -1) {
      return -1;

    }
    int max = Math.max(leftd, rigthtd);
    if (max + 1 == k) {
      System.out.println(root.data);
    }
    return max + 1;
  }

  // transform
  public static int transform(Node root) {
    if (root == null) {
      return 0;
    }

    int leftSum = transform(root.left);
    int rightSum = transform(root.right);
    int oldData = root.data;
    // int data = root.data;

    // root.data = root.left.data + leftchild + root.right.data + rightchild;
    root.data = leftSum + rightSum;
    // return data;
    return oldData + root.data;
  }

  // pre order printing
  public static void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {
    System.out.println("Welcomt to comman ancestor");

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // int n1 = 5, k = 2;
    // System.out.println(minDist(root, n1, n2));
    // System.out.println(knthancestor(root, n1, k));

    transform(root);
    preorder(root);

  }
}
