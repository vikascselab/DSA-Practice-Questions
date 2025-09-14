import java.util.Scanner;

public class Sumofoddnumber {
  public static void main(String[] args) {
    System.out.println("welcome to sum of odd number");

    Scanner Input = new Scanner(System.in);
    System.out.println("enter the number");

    int num = Input.nextInt();

    int sum = 0;
    for (int i = 1; i <= num; i = i + 2) {
      sum = sum + i;

    }
    System.out.println(sum);
  }
}
