
public class prefixproblem {

  static class Node {
    Node childern[] = new Node[26];
    boolean eow;
    int freq;

    public Node() {
      for (int i = 0; i < childern.length; i++) {
        childern[i] = null;
        freq = 1;

      }
    }
  }

  public static Node root = new Node();

  // insert

  public static void insert(String word) {
    Node curr = root;

    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';

      if (curr.childern[idx] == null) {
        curr.childern[idx] = new Node();

      } else {
        curr.childern[idx].freq++;

      }
      curr = curr.childern[idx];

    }
    curr.eow = true;
  }

  // Print prefix

  public static void findprefix(Node root, String ans) {

    if (root == null) {
      return;

    }

    if (root.freq == 1) {
      System.out.println(ans);
      return;

    }
    for (int i = 0; i < root.childern.length; i++) {
      if (root.childern[i] != null) {
        findprefix(root.childern[i], ans + (char) (i + 'a'));

      }

    }
  }

  public static void main(String[] args) {
    System.out.println("welcome to prefix problem");

    String arr[] = { "zebra", "dog", "duck", "dove" };

    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);

    }

    root.freq = -1;

    String ans = " ";
    findprefix(root, ans);

  }

}
