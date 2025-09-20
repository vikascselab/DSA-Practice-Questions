class StrinfCompress {

  public static void main(String[] args) {

    System.out.println("welcome to string compress");

    String str = "aaabbccdd";

    System.out.println(Compress(str));

  }

  public static String Compress(String str) {

    String newS = "";
    for (int i = 0; i < str.length(); i++) {

      Integer count = 1;

      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

        count++;
        i++;

      }
      newS += str.charAt(i);

      if (count > 1) {
        newS += count.toString();
      }

    }

    return newS;
  }

}
