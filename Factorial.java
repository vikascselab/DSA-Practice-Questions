import java.util.Scanner;

class Factorial {

  public static void main(String[] args) {

    System.out.println("welcome to factorial number");
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number");

    int num = Input.nextInt();
    System.out.println(" Also enter the valu of R");
    int r = Input.nextInt();

    long N = Fact(num);
    long R = Fact(r);

    long K = Fact(num - r);

    long ncr = N / (R * K);

    System.out.println(ncr);

  }

  public static long Fact(int num) {
    long fact = 1;
    if (num == 0) {
      System.out.println("fact of zero is 1");
    } else if (num < 0) {
      System.out.println("negative number fact not exist");
    } else {
      for (int i = 1; i <= num; i++) {
        fact = fact * i;
      }

    }
    return fact;

  }

}
