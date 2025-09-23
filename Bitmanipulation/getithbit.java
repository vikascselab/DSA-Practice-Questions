class getithbit {

  public static void main(String[] args) {
    System.out.println("welcome to get ith bit");

    System.out.println(getbit(15, 2));

  }

  public static int getbit(int n, int i) {
    int bitmask = 1 << i;
    if ((n & bitmask) == 0) {

      return 0;

    }
    return 1;
  }
}
