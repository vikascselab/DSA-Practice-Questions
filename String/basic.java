
import java.util.Scanner;

class basic {

  public static void printLetter(String fullname) {

    for (int i = 0; i < fullname.length(); i++) {
      System.out.print(fullname.charAt(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // char[] a = new char[4];

    // char arr[] = { 'a', 'b' };

    // String str = "abxd";
    // String str2 = new String("abcd");

    Scanner Input = new Scanner(System.in);

    String name;
    System.out.println(" Enter the name");
    name = Input.nextLine();
    System.out.println(name);
    System.out.println("Length of string" + name.length());

    String firstname = "viksa";
    String lastname = "yadav";

    String fullnam = firstname + " " + lastname;

    // System.out.println(fullname.charAt(1));

    printLetter(fullnam);

  }

}
