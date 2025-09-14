import java.util.Scanner;

class Sumnatural {

  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);
    System.out.println("enter the number");
    int n = Input.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }

}
