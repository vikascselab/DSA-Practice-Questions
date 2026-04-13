import java.util.Scanner;

public class SubArrays {

  public static void main(String[] args) {
    System.out.println("Welcome to Largest number ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    int sum = 0;

    int largest = Integer.MIN_VALUE; // use for finding largest number

    for (int i = 0; i < marks.length; i++) {

      // int start=i;
      for (int j = 0; j < marks.length; j++) {
        // int end=j;
        sum = 0;

        for (int k = i; k <= j; k++) {

          System.out.print("[" + marks[k] + "]");
          sum = sum + marks[k];
        }
        System.out.println();
        // System.out.println("Sum of all sub arrays " + sum);
        if (largest < sum) {
          largest = sum;

        }

      }
      System.out.println();

    }
    // System.out.println("Sum of all sub arrays " + sum);
    System.out.println("largest sub arays" + largest);

  }
}
