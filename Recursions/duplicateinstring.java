
class duplicateinstring {

  public static void main(String[] args) {
    System.out.println("welcome to duplicate char in string ");

    String str = "appnnacollege";

    boolean k[] = new boolean[26];

    duplicate(str, 0, new StringBuilder(""), k);

  }

  public static void duplicate(String str, int idx, StringBuilder newstr, boolean map[]) {

    if (idx == str.length()) {

      System.out.println(newstr);
      return;

    }

    char currchar = str.charAt(idx);

    if (map[currchar - 'a'] == true) {
      duplicate(str, idx + 1, newstr, map);

    } else {

      map[currchar - 'a'] = true;

      duplicate(str, idx + 1, newstr.append(currchar), map);
    }

  }

}
