
public class Arraybacktraking {
  public static void main(String[] args) {
    System.out.println("welcome to back tracking");

    int[] arr = new int[5];

    ChangeArays(arr, 0, 1);

    PrintArray(arr);

  }

  public static void ChangeArays(int arr[], int i, int val) {

    // base condition

    if (i == arr.length) {

      PrintArray(arr);

      return;

    }

    arr[i] = val;
    ChangeArays(arr, i + 1, val + 1);/// after returing the call executed by this line

    arr[i] = arr[i] - 2;

  }

  public static void PrintArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i]);
    }

  }

}
