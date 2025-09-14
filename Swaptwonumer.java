import java.util.Scanner;

class Swaptwonumer {

  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the value of a and b");
    int a = Input.nextInt();
    int b = Input.nextInt();

    int c;

    System.out.println("before swaping numer a=" + a);
    System.out.println("before swaping numer  b=" + b);

    c = a;
    a = b;
    b = c;
    System.out.println("before swaping numer a=" + a);
    System.out.println("before swaping numer a=" + b);

  }

}