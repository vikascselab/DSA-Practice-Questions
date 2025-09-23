package Recursions;

public class xpowern {

  public static void main(String[] args) {
    System.out.println("welcome to x power n");

    System.out.println(power(2, 10));

  }

  public static double power(int x, int n) {

    if (n == 0) {
      return 1;
    }

    double pow = x * Math.pow(x, n - 1);

    return pow;
  }

}
