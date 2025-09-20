class Pailindrame {

  public static void main(String[] args) {
    System.out.println("Welcome to pailndrrame");

    String name = "racecar";

    System.out.println(ispalindrame(name));

  }

  public static boolean ispalindrame(String name) {

    for (int i = 0; i < name.length(); i++) {
      int n = name.length();
      if (name.charAt(i) != name.charAt(n - i - 1)) {

        // System.out.println();

        return false;

      }

    }

    return true;
  }
}
