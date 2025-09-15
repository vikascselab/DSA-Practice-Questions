import java.util.Scanner;

class BinarySerch {

  public static void main(String[] args) {
    System.out.println("Welcome to Binary search ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);
    System.out.println("Enter the value that is you want to find");

    int key = Input.nextInt();

    int kya = BinaryS(marks, key);

    if (kya == -1) {
      System.out.println("Enter element Not found");
    } else {
      System.out.println("Enter element found at index " + (kya + 1));
    }

  }

  public static int BinaryS(int[] marks, int key) {

    int start = 0;
    int end = (marks.length - 1);
    while (start <= end) {

      int mid = (start + end) / 2;

      if (marks[mid] == key) {
        return mid; // found

      }
      if (marks[mid] > key) {

        end = (mid - 1);
      } else {

        start = (mid + 1);

      }

    }
    return -1;

  }
}
