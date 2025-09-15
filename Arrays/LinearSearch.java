import java.util.Scanner;

class LinearSearch {

  public static void main(String[] args) {
    System.out.println("Welcome to Linear search ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    // arrayFunction.Arraysoutput(marks);

    System.out.println("Enter the valut that you want to search");
    int key = Input.nextInt();

    // for (int i = 0; i < marks.length; i++) {
    // if (marks[i] == key) {

    // System.out.println("Element index is:" + i);
    // break;
    // } else {
    // System.out.println("Element not exist");
    // break;
    // }

    // }

    int kya = LinearS(marks, key);

    if (kya == -1) {
      System.out.println("Element not exist");
    } else {
      System.out.println("Element at index: " + kya);
    }

  }

  public static int LinearS(int[] marks, int key) {
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] == key) {
        return i;
      }
    }

    return -1;

  }
}
