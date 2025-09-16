import java.util.Scanner;

class solidrhombus {

  public static void main(String[] args) {
    System.out.println("Welcome to pattern World");

    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number");

    int n = Input.nextInt();

    for (int i = 1; i <= n; i++) {

      // spce j<=n
      for (int j = 1; j <= (n - i); j++) {
        System.out.print("   ");
      }

      for (int j = 1; j <= i; j++) {

        System.out.print(" * ");
      }
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" * ");
      }

      System.out.println();
    }

  }

}