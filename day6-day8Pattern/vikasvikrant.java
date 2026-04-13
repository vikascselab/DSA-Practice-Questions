import java.util.Scanner;

public class vikasvikrant {
  public static void main(String[] args) {
    System.out.println("Welcome to pattern World");

    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number");

    int n = Input.nextInt();

    pattern(n);

    // 2nd half
    // for (int i = n; i >= 1; i--) {

    // // spce j<=n
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // for (int j = 1; j <= (2 * i - 1); j++) {

    // System.out.print(" * ");
    // }

    // System.out.println();
    // }

  }

  public static void pattern(int n) {
    for (int i = 1; i <= n; i++) {

      // spce j<=n
      for (int j = 1; j <= (n - i); j++) {
        System.out.print("   ");
      }
      // star
      for (int j = 1; j <= (2 * i) - 1; j++) {

        System.out.print(" * ");
      }
      // spce j<=n
      // for (int j = 1; j <= (n - i); j++) {
      // System.out.print(" ");
      // }
      // // spce j<=n
      // for (int j = 1; j <= (n - i); j++) {
      // System.out.print(" ");
      // }
      // // star
      // for (int j = 1; j <= (2 * i) - 1; j++) {

      // System.out.print(" * ");
      // }

      System.out.println();
    }

  }

}
