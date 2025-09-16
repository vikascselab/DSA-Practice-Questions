import java.util.Scanner;

class Butterflynew {

  public static void main(String[] args) {
    System.out.println("Welcome to butterfly Pattern");

    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number of row and colum");

    int n = Input.nextInt();

    // 1st half
    for (int i = 1; i <= n; i++) {

      // star - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // space 2*(n-i)

      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // star -i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }

    // 2nd half
    for (int i = n; i >= 1; i--) {

      // star - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // space 2*(n-i)

      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // star -i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}