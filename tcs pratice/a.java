import java.util.*;

public class a {
  public static void main(String[] args) {
    System.out.println("welcome");

    // int a = 8;
    // int b = 5;

    // System.out.println(a + b);
    // System.out.println(a - b);
    // System.out.println(a * b);
    // System.out.println(a / b);
    // System.out.println(a % b);

    // double x = 5;
    // double y = 3;
    // System.out.println(x + y);
    // System.out.println(x - y);
    // System.out.println(x * y);
    // System.out.println(x / y);

    // String str = "vikas";
    // System.out.println(str);

    // Scanner sc = new Scanner(System.in);
    // System.out.println("ente the value of ..");

    // System.out.println("enter the value of a and b");
    // System.out.println(sum());
    // System.out.println(Math.abs(-99));
    // System.out.println(Math.ceil(5.07));
    // System.out.println(Math.floor(5.07));
    // System.out.println(Math.round(5.57));
    // System.out.println(Math.PI);
    // System.out.println(Math.sqrt(25));

    // StringBuilder sb = new StringBuilder("First");
    // sb.append(45);
    // sb.append(", now this is the");
    // sb.append(76.45);
    // System.out.println(sb);

    // int a = 6;
    // int b = 8;

    // int love = a > b ? a : b;

    // System.out.println(love);
    // Integer first = 55;
    // System.out.println(first);
    // int second = first;
    // System.out.println(second);

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    char[] ch = new char[n];

    for (int i = 0; i < n; i++) {
      ch[i] = sc.next().charAt(0);
    }

    for (int i = 0; i < n; i++) {
      System.out.println("the loop is " + ch[i]);
    }

  }

  public static int sum() {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a + b;

    return sum;

  }
}
