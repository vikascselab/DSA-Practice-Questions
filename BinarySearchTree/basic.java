import java.util.*;

public class basic {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;

    }
  }

  public static Node Insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = Insert(root.left, val);

    } else {
      root.right = Insert(root.right, val);
    }
    return root;

  }

  public static void inorder(Node root) {
    if (root == null) {
      return;

    }
    inorder(root.left);
    System.out.println(root.data + " ");
    inorder(root.right);
  }
  // search in binary tree

  public static boolean biSearch(Node root, int key) {
    if (root == null) {
      return false;

    }

    if (root.data == key) {
      return true;

    }

    if (root.data > key) {
      return biSearch(root.left, key);
    } else {
      return biSearch(root.right, key);
    }

  }

  // deleting the node
  public static Node delete(Node root, int val) {
    if (root.data < val) {
      root.right = delete(root.right, val);

    } else if (root.data > val) {
      root.left = delete(root.left, val);
    } else {

      // case 1
      if (root.left == null && root.right == null) {
        return null;

      }

      // case 2

      if (root.left == null) {
        return root.right;

      } else if (root.right == null) {
        return root.left;

      }

      // case 3
      Node IS = inordersus(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;

  }
  // find in order sussesor

  public static Node inordersus(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }
  // print in range

  public static void PrintInrange(Node root, int k1, int k2) {
    if (root == null) {
      return;

    }

    if (root.data >= k1 && root.data <= k2) {
      PrintInrange(root.left, k1, k2);
      System.out.println(root.data);
      PrintInrange(root.right, k1, k2);

    } else if (root.data < k1) {
      PrintInrange(root.left, k1, k2);
    } else {
      PrintInrange(root.right, k1, k2);
    }
  }

  // print path
  public static void printpath(ArrayList<Integer> path) {
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + "->");

    }
    System.out.println("Null");
  }

  // rooot to leaf
  public static void print2node(Node root, ArrayList<Integer> path) {
    if (root == null) {
      return;

    }

    path.add(root.data);
    if (root.left == null && root.right == null) {
      printpath(path);

    }

    print2node(root.left, path);
    print2node(root.right, path);
    path.remove(path.size() - 1);
  }
  // valid bst

  public static boolean isValidBst(Node root, Node min, Node max) {
    if (root == null) {
      return true;

    }

    if (min != null && root.data <= min.data) {
      return false;
    } else if (max != null && root.data >= max.data) {
      return false;

    }

    return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);

  }

  public static void main(String[] args) {
    System.out.println("welcome to binary search tree");

    int values[] = { 8, 5, 3, 4, 6, 10, 11, 14 };
    Node root = null;

    for (int i = 0; i < values.length; i++) {
      root = Insert(root, values[i]);

    }
    inorder(root);
    System.out.println();
    // int k = 10;
    // if (biSearch(root, k)) {
    // System.out.println(" value is found");

    // } else {
    // System.out.println("value is not found");

    // }
    // root = delete(root, 1);
    // System.out.println();
    // inorder(root);

    // PrintInrange(root, 5, 12);
    // print2node(root, new ArrayList<>());

    if (isValidBst(root, null, null)) {
      System.out.println("valid bst");

    } else {
      System.out.println("not valid bst");
    }

  }
}
