class countsetbits {

  public static void main(String[] args) {
    System.out.println("welcome to set bit");

    System.out.println(countset(15));

  }

  public static int countset(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) != 0) {

        count++;

      }
      n = n >> 1;
    }

    return count;
  }

}
