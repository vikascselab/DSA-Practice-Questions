import java.util.Scanner;

class kadanesSubArrays {

  public static void main(String[] args) {
    System.out.println("Welcome to kadanne's alogorithms ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    int largest = Integer.MIN_VALUE;

    int curr = 0;

    for (int i = 0; i < marks.length; i++) {
      curr = curr + marks[i];
      if (curr < 0) {
        curr = 0;

      }

      largest = Math.max(curr, largest);
    }

    System.out.println("largest sub arrays is " + largest);
  }
}