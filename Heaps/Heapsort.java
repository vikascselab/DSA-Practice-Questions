public class Heapsort {

  public static void heapify(int arr[], int i, int size) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int minidx = i;

    if (left < size && arr[left] > arr[minidx]) {

      minidx = left;
    }

    if (right < size && arr[right] > arr[minidx]) {

      minidx = right;
    }
    // kharb na huva ho
    if (minidx != i) {
      // swap

      int temp = arr[i];
      arr[i] = arr[minidx];
      arr[minidx] = temp;

      heapify(arr, 0, i);

    }
  }

  public static void heapsort(int arr[]) {

    // buils maxheap
    int n = arr.length;

    for (int i = n / 2; i >= 0; i--) {
      heapify(arr, i, n);
    }

    // psh largest at end

    for (int i = n - 1; i > 0; i--) {
      // swap
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      heapify(arr, 0, i);

    }

  }

  public static void main(String[] args) {
    System.out.println("welcome to heap sort");
    int arr[] = { 1, 2, 4, 5, 3 };

    heapsort(arr);

    for (int i = 0; i < arr.length; i++) {

      System.out.println(arr[i]);

    }
  }

}
