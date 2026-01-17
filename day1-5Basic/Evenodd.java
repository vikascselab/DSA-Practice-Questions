
import java.util.Scanner;

class Evenodd {
  public static void main(String[] args) {

    System.out.println("Welcome to odd even ");
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number that you want to chech even or not");

    int a = Input.nextInt();

    if (a % 2 == 0) {
      System.out.println("given number is even");

    } else {
      System.out.println("given number is odd");
    }

  }
}
