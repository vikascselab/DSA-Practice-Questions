import java.util.*;

class Pushatbottom {

  public static void main(String[] args) {
    System.out.println(" welcome to push at bottom");

    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);

    pushatBotom(s, 4);

    while (!s.isEmpty()) {
      System.out.println(s.pop());

    }
  }

  public static void pushatBotom(Stack<Integer> s, int data) {

    if (s.isEmpty()) {

      s.push(data);
      return;

    }

    int top = s.pop();
    pushatBotom(s, data);

    s.push(top);

  }

}
