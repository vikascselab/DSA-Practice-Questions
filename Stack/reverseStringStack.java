import java.util.*;

class reverseStringStack {

  public static void main(String[] args) {
    System.out.println("welcome to reverse useing stack");

    String str = "abc";

    System.out.println(reversesS(str));

  }

  public static String reversesS(String str) {

    Stack<Character> s = new Stack<>();

    int idx = 0;
    while (idx < str.length()) {

      s.push(str.charAt(idx));

      idx++;

    }

    StringBuilder result = new StringBuilder("");

    while (!s.isEmpty()) {

      char curr = s.pop();

      result.append(curr);

    }

    return str = result.toString();

  }

}
