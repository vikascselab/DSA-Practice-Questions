import java.util.Scanner;

class Printreverse {
  public static void main(String[] args) {
    System.out.println("Welcome to reverse of a number");
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number");

    int num = Input.nextInt();

    int rev = 0;
    while (num > 0) {
      int n = num % 10;
      rev = rev * 10 + n;
      num = num / 10;
    }
    System.out.println(rev);
  }
}
