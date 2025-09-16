import java.util.Scanner;

class Pairofarrays {

  public static void main(String[] args) {
    System.out.println("Welcome to pair of array ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    for (int i = 0; i < marks.length; i++) {
      int curr = marks[i];
      for (int j = i + 1; j < marks.length; j++) {
        System.out.println("Pair of element is (" + curr + "," + marks[j] + ")");
      }
    }

  }
}