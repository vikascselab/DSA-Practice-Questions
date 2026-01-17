import java.util.Scanner;

class DecimalTobinary {

  public static void main(String[] args) {
    System.out.println("Weclcome to Decimal to Binary");
    Scanner Input = new Scanner(System.in);
    System.out.println(" Enter the Decimal Number");

    int num = Input.nextInt();

    double k = 0;
    int i = 0;

    while (num >= 1) {
      int r = num % 2;
      // store the binary number
      k = k + (r * (Math.pow(10, i)));
      i++;

      num = num / 2;

    }
    System.out.println(k);
  }

}
