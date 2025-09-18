import java.util.Scanner;

class CountSort {

  public static void main(String[] args) {
    System.out.println("Welcome to Buy and selll stocks ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < marks.length; i++) {

      largest = Math.max(largest, marks[i]);

    }

    int[] count = new int[largest + 1];

    for (int i = 0; i < marks.length; i++) {

      count[marks[i]]++;
    }

    int j = 0;

    for (int i = 0; i < count.length; i++) {

      while (count[i] > 0) {
        marks[j] = i;
        j++;
        count[i]--;
      }
    }

    arrayFunction.Arraysoutput(marks);

  }
}