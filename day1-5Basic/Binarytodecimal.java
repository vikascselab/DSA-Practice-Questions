import java.util.Scanner;

class Binarytodecimal {

  public static void main(String[] args) {
    System.out.println("Welcome to Binary to decimal");

    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the binary number");

    int Bnum = Input.nextInt();

    int i = 0;
    double P = 0;
    while (Bnum > 0) {

      int k = Bnum % 10;
      P = P + (Math.pow(2, i) * k);
      i++;

      Bnum = Bnum / 10;

    }
    System.out.println(P);
  }

}
