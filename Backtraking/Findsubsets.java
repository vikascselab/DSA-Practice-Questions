
public class Findsubsets {

  public static void main(String[] args) {
    System.out.println("Welcome to subsets of string");

    String str = "abc";
    findsubsets(str, " ", 0);

  }

  public static void findsubsets(String str, String ans, int i) {

    // base

    if (i == str.length()) {

      System.out.println(ans);
      return;

    }
    /// yes choice,left
    findsubsets(str, ans + str.charAt(i), i + 1);

    // no choice,right

    findsubsets(str, ans, i + 1);

  }

}
