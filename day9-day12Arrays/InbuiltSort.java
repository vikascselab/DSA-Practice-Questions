import java.util.Arrays;
import java.util.Scanner;

class InbuiltSort {
  public static void main(String[] args) {
    System.out.println("Welcome to Buy and selll stocks ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    Arrays.sort(marks);

    arrayFunction.Arraysoutput(marks);
  }
}
