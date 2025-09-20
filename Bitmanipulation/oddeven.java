
class oddeven {

  public static void main(String[] args) {
    System.out.println("welcome to odd even");

    Oddeven(8);

  }

  public static void Oddeven(int num) {

    int bitmask = 1;

    if ((num & bitmask) == 0) {

      System.out.println("given number is Even");

    }

    else {

      System.out.println("given number is odd");
    }
  }

}
