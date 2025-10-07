import java.util.*;

class validParen {
  public static void main(String[] args) {
    System.out.println(" welcome to valid parentheses");

    String str = "({})[";

    System.out.println(isvalid(str));
  }

  public static boolean isvalid(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);

      if (ch == '(' || ch == '{' || ch == '[') {

        s.push(ch);

      } else {
        // closing

        if (s.isEmpty()) {
          return false;

        }

        if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {

          s.pop();

        } else {
          return false;
        }
      }

    }

    if (s.isEmpty()) {
      return true;

    } else {
      return false;

    }

  }
}
