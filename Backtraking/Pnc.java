
class Pnc {

  public static void main(String[] args) {
    System.out.println("welcome to pnc");
    String str = "abc";
    Pnc(str, "");

  }

  public static void Pnc(String str, String ans) {

    if (str.length() == 0) {
      System.out.println(ans);
      return;

    }

    for (int i = 0; i < str.length(); i++) {

      char curr = str.charAt(i);

      String Newstr = str.substring(0, i) + str.substring(i + 1);

      Pnc(Newstr, ans + curr);

    }
  }

}
