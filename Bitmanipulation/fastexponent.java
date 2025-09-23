class fastexponent {

  public static void main(String[] args) {
    System.out.println("welcome to faxt exponentation");

    System.out.println(fast(5, 100000));

  }

  public static double fast(int a, int n) {
    int ans = 1;
    while (n > 0) {

      if ((n & 1) != 0) {
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;

  }

}
