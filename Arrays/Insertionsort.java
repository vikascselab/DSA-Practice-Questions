import java.util.Scanner;

class Insertionsort {

  public static void main(String[] args) {
    System.out.println("Welcome to Buy and selll stocks ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    for (int i = 1; i < marks.length; i++) {

      int curr = marks[i];
      int prev = i - 1;

      while (prev >= 0 && marks[prev] > curr) {

        marks[prev + 1] = marks[prev];
        prev--;

      }

      marks[prev + 1] = curr;
    }

    arrayFunction.Arraysoutput(marks);

  }
}
