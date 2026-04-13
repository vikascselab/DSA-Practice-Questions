import java.util.Scanner;

class ReverseArrray {

  public static void main(String[] args) {
    System.out.println("Welcome to Rverse of arrays ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    int first = 0;
    int last = (marks.length - 1);

    while (first < last) {

      int temp = marks[last];
      marks[last] = marks[first];
      marks[first] = temp;

      first++;
      last--;

    }
    System.out.println("After rverse the number");
    arrayFunction.Arraysoutput(marks);

  }

}
