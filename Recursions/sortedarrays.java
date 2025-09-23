package Recursions;

class sortedarrays {

  public static void main(String[] args) {
    System.out.println("Welcome to sortd arras");

    int number[] = { 1, 2, 4, 3 };
    System.out.println(isortd(number, 0));

  }

  public static boolean isortd(int[] arr, int i) {

    if (i == arr.length - 1) {
      return true;

    }

    if (arr[i] > arr[i + 1]) {
      return false;

    }

    return isortd(arr, i + 1);

  }

}
