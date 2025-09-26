class allbinaryconsecutive {

  public static void main(String[] args) {
    System.out.println("welcome to binary printing");

    printbinary(3, 0, " ");
  }

  public static void printbinary(int n, int lastplace, String str) {

    // base

    if (n == 0) {
      System.out.println(str);
      return;

    }
    // kam
    printbinary(n - 1, 0, str + "0");

    if (lastplace == 0) {

      printbinary(n - 1, 1, str + "1");
    }

  }
}
