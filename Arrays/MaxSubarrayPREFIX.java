import java.util.Scanner;

class MaxSubarrayPREFIX {

  public static void main(String[] args) {
    System.out.println("Welcome to sum of all sub arrays using Prefix sum ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);
    int currsum = 0;
    int largest = Integer.MIN_VALUE;
    int[] prefix = new int[marks.length];

    prefix[0] = marks[0];

    for (int i = 1; i < prefix.length; i++) {

      prefix[i] = prefix[i - 1] + marks[i];
    }

    for (int i = 0; i < marks.length; i++) {

      // int start=i;
      for (int j = 0; j < marks.length; j++) {
        // int end=j;
        currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (largest < currsum) {

          largest = currsum;

        }

      }

    }
    System.out.println("largest sub arrays" + largest);

  }
}
