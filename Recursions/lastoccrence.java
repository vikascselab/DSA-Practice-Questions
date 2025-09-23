package Recursions;

class lastoccrence {

  public static void main(String[] args) {

    System.out.println("Welcome to first occurance");

    int number[] = { 1, 2, 7, 4, 5, 4 };

    System.out.println(lastocc(number, 0, 4));
  }

  public static int lastocc(int arr[], int i, int key) {

    if (i == arr.length) {
      return -1;
    }
    int isfound = lastocc(arr, i + 1, key);
    if (isfound == -1 && arr[i] == key) {
      return i;

    }

    return isfound;

  }
}
