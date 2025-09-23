class setbit {

  public static void main(String[] args) {
    System.out.println("welcome to set bit");

    System.out.println(setbit(10, 2));

  }

  public static int setbit(int n, int i) {

    int bitmask = 1 << i;
    return n | bitmask;

  }

}
