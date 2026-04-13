import java.util.Scanner;

class Largestnumber {
  public static void main(String[] args) {
    System.out.println("Welcome to Largest number ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < marks.length; i++) {
      if (max < marks[i]) {
        max = marks[i];

      }
      if (min > marks[i]) {
        min = marks[i];
      }

    }
    System.out.println("maximaum number is " + max);
    System.out.println("Minimum valur is " + min);
  }

}
