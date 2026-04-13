import java.util.Scanner;

class StarPattern {
  public static void main(String[] args) {
    System.out.println("Welcome to star pattern ");
    Scanner Input = new Scanner(System.in);
    System.out.println(" Enter the row");
    int row = Input.nextInt();
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" *");
      }
      System.err.println("");
    }
  }
}
