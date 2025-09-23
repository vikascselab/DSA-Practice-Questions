class sumoffirst {
  public static void main(String[] args) {
    System.out.println("welcome to sum of n natural");

    System.out.println(sum(5));

  }

  public static int sum(int n) {

    if (n == 1) {

      return 1;

    }

    int sum1 = n + sum(n - 1);

    return sum1;
  }
}
