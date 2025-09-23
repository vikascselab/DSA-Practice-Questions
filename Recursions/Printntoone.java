package Recursions;

public class Printntoone {
  public static void main(String[] args) {
    System.out.println("Welcome to recursion ");

    int n = 10;

    decnum(n);

  }

  public static void decnum(int n) {

    // if (n == 1) {
    // System.out.println(n);
    // return;
    // }

    System.out.println(n + " ");
    decnum(n - 1);

  }

}
