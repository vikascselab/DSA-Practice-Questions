import java.util.Scanner;

class leapyear {

  public static void main(String[] args) {

    System.out.println("welcome to leap year");
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("Your year is a leap year");
    } else {
      System.out.println("Your year is not a leap year");
    }
  }

}
