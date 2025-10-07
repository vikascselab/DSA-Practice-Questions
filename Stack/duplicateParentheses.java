import java.util.*;

class duplicateParentheses {
  public static void main(String[] args) {
    System.out.println(" welcome to duplicate parenthees");

    String str1 = "((a+b))"; // true

    String str2 = "(a-b)"; // false

    System.out.println(isDuplicate(str2));
  }

  public static boolean isDuplicate(String str) {

    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);
      // closing

      if (ch == ')') {
        int cout = 0;
        while (s.peek() != '(') {
          s.pop();
          cout++;

        }

        if (cout < 1) {
          return true; /// duplicate exist

        } else {
          s.pop(); // opening pair
        }

      } else {
        // opening case

        s.push(ch);

      }

    }

    return false;

  }

}
