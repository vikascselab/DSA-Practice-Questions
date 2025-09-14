import java.util.Scanner;

class Primenumber {

  public static void main(String[] args) {

    System.out.println("welcome to Prime numer or not");
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the number that you want to check prime or not");
    int num = Input.nextInt();

    // boolean kya = isPrime(num);

    // this code is add for printing Prime number in give range

    for (int i = 2; i <= num; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }

    // if (kya) {
    // System.out.println("Give number is prime");

    // } else {
    // System.out.println("Give number is not prime");
    // }

  }

  public static boolean isPrime(int num) {

    int i = 2;

    while (i < num) {
      if (num % i == 0) {

        return false;
      }
      i++;
    }
    return true;

  }

}
