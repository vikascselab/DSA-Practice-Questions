class clearlastithbit {

  public static void main(String[] args) {
    System.out.println("Welcome clear last ith bit");

    System.out.println(lastith(15, 2));

  }

  public static int lastith(int n, int i) {

    return n & ((~0) << i);
  }

}
