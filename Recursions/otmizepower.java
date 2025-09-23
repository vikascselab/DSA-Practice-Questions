package Recursions;

public class otmizepower {

  public static void main(String[] args) {
    System.out.println("welcome to x power n");

    System.out.println(optpow(2, 10));

  }

  public static double optpow(int x, int n) {

    if (n == 0) {
      return 1;
    }

    double opt = optpow(x, n / 2) * optpow(x, n / 2);

    if (n % 2 != 0) {

      opt = x * opt;

    }

    return opt;
  }

}
