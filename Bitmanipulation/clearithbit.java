class clearithbit {

  public static void main(String[] args) {
    System.out.println("welcome to ith bit clear");

    System.out.println(clearbit(10, 1));

  }

  public static int clearbit(int n, int i) {

    int bitmask = ~(1 << i);

    return n & bitmask;
  }

}
