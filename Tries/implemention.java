
public class implemention {
  static class Node {
    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
      for (int i = 0; i < children.length; i++) {
        children[i] = null;

      }
    }

  }

  public static Node root = new Node();

  // insertion of element

  public static void insert(String word) {
    Node curr = root;
    for (int level = 0; level < word.length(); level++) {
      int idx = word.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();

      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  // searchin the element

  public static boolean search(String key) {
    Node curr = root;
    for (int level = 0; level < key.length(); level++) {
      int idx = key.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        return false;

      }
      curr = curr.children[idx];
    }
    return curr.eow == true;

  }

  // wordbrek problem
  public static boolean wordBreak(String key) {
    if (key.length() == 0) {
      return true;

    }
    for (int i = 1; i <= key.length(); i++) {
      if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {

        return true;

      }
    }
    return false;

  }

  // stats with problem

  public static boolean Statwith(String prefix) {
    Node cur = root;
    for (int i = 0; i < prefix.length(); i++) {
      int idx = prefix.charAt(i) - 'a';
      if (cur.children[idx] == null) {
        return false;

      }

      cur = cur.children[idx];
    }
    return true;

  }

  // count unique sustring

  public static int couNode(Node root) {
    if (root == null) {
      return 0;

    }

    int cout = 0;
    for (int i = 0; i < 26; i++) {
      if (root.children[i] != null) {
        cout += couNode(root.children[i]);

      }
    }
    return cout + 1;
  }

  // longest word

  public static String ans = "";

  public static void logestword(Node root, StringBuilder temp) {
    if (root == null) {
      return;

    }
    for (int i = 0; i < 26; i++) {
      if (root.children[i] != null && root.children[i].eow == true) {
        char ch = (char) (i + 'a');
        temp.append(ch);
        if (temp.length() > ans.length()) {
          ans = temp.toString();

        }
        logestword(root.children[i], temp);

        temp.deleteCharAt(temp.length() - 1);
      }

    }
  }

  public static void main(String[] args) {
    System.out.println("welcome to tries implementaion");

    // String words[] = { "the", "a", "there", "their", "any", "thee" };

    // for (int i = 0; i < words.length; i++) {

    // insert(words[i]);

    // }

    // String key = "theo";

    // if (search(key)) {
    // System.out.println("give key is exist");

    // } else {
    // System.out.println("not exist");
    // }

    // String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

    // for (int i = 0; i < words.length; i++) {
    // insert(words[i]);

    // }

    // String key = "ilikesamsungo";

    // System.out.println(wordBreak(key));

    // String words[] = { "apple", "app", "mango", "man", "woman" };
    // String prifix1 = "app";
    // String prifix2 = "moon";

    // for (int i = 0; i < words.length; i++) {
    // insert(words[i]);

    // }

    // System.out.println(search(prifix2));

    String str = "ababa";

    // for (int i = 0; i < str.length(); i++) {
    // String suffix = str.substring(i);
    // insert(suffix);
    // }
    // System.out.println(couNode(root));

    String words[] = { "a", "banana", "appl", "app", "ap", "apply", "apple" };

    for (int i = 0; i < words.length; i++) {

      insert(words[i]);

    }

    logestword(root, new StringBuilder());

    System.out.println(ans);
  }

}
