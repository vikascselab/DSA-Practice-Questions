import java.util.Scanner;

class BubbleSort {

  public static void main(String[] args) {
    System.out.println("Welcome to Binary search ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    for (int i = 0; i < marks.length - 1; i++) {
      for (int j = 0; j < marks.length - 1 - i; j++) {
        if (marks[j] > marks[j + 1]) {

          int temp = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = temp;

        }
      }
    }

    arrayFunction.Arraysoutput(marks);

  }
}
