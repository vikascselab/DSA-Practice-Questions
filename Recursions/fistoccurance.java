package Recursions;

public class fistoccurance {

  public static void main(String[] args) {

    System.out.println("Welcome to first occurance");

    int number[] = { 1, 2, 7, 4 };

    System.out.println(firstocc(number, 0, 9));
  }

  public static int firstocc(int arr[], int i, int key) {

    if (i == arr.length) {
      return -1;

    }

    if (arr[i] == key) {
      return i;

    }

    return firstocc(arr, i + 1, key);
  }

}
