class numberispowerof {

  public static void main(String[] args) {
    System.out.println("welcome to power ");

    System.out.println(poweris(5));

  }

  public static boolean poweris(int n) {
    return (n & (n - 1)) == 0;
  }

}
