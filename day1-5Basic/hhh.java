import java.util.Scanner;

class hhh {

  public static void main(String[] args) {
    System.out.println("Weclcome to Decimal to Binary");
    Scanner Input = new Scanner(System.in);
    System.out.println(" Enter the Decimal Number");

    int num = Input.nextInt();
    int k = 0;
    int i = 1;
    while (num >= 1) {
      int r = num % 2;
      k = (int) (r * Math.pow(10, i) + k);
      System.out.print(r);
      i++;
      num = num / 2;

    }
    System.out.println("VAlue of :" + k);
  }

}
