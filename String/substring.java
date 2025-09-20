class substring {

  public static void main(String[] args) {
    System.out.println("welcome to substring");

    String str = "helloworld";

    // System.out.println(Substring(str, 0, 4));
    System.out.println(str.substring(0, 4));

  }

  public static String Substring(String str, int si, int ei) {
    String substr = "";
    for (int i = si; i < ei; i++) {

      substr += str.charAt(i);

    }

    return substr;
  }
}