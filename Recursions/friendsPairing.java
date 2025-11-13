class friendsPairing {

  public static void main(String[] args) {
    System.out.println("Welcome to friends pairing");
    System.out.println(pair(5)); // Example with 3 friends
  }

  public static int pair(int n) {
    // base cases
    if (n == 0 || n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }

    // choice 1: friend stays single
    int single = pair(n - 1);

    // choice 2: friend pairs up with one of (n-1) friends
    int pair = (n - 1) * pair(n - 2);

    // total
    return single + pair;
  }
}
