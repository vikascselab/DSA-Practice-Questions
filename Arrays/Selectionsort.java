import java.util.Scanner;

class Selectionsort {

  public static void main(String[] args) {
    System.out.println("Welcome to Binary search ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    for (int i = 0; i < marks.length - 1; i++) {

      int minpos = i;

      for (int j = i + 1; j < marks.length - 1; j++) {
        if (marks[minpos] > marks[j]) {

          minpos = j;

        }
      }

      int tem = marks[minpos];
      marks[minpos] = marks[i];
      marks[i] = tem;

    }

    arrayFunction.Arraysoutput(marks);

  }
}
