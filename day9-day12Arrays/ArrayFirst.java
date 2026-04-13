
import java.util.Scanner;

class ArrayFirst {

  public static void main(String[] args) {
    System.out.println("Welco,e to array world");
    // practice for decleration of array

    // int arry[] = new int[15];
    // int number[] = { 1, 2, 3, 4 };
    // String fruits[] = { "apple", "Banana", "mango" };

    // System.out.println(number[3]);
    Scanner Input = new Scanner(System.in);

    int Array[] = new int[3];

    // System.out.println(Array.length);

    for (int i = 0; i < Array.length; i++) {

      Array[i] = Input.nextInt();

    }

    System.out.println("Array elements");

    for (int i = 0; i < Array.length; i++) {

      System.out.println(Array[i]);

    }

  }
}
