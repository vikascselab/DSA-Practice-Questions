class quicksort {
  public static void main(String[] args) {
    System.out.println("welcome to quick sort");

    int arr[] = { 6, 3, 9, 8, 2, 5 };
    quicksort(arr, 0, arr.length - 1);

    mergsort.printarrays(arr);

  }

  public static void quicksort(int arr[], int si, int ei) {

    if (si >= ei) {
      return;

    }

    int pid = partition(arr, si, ei);
    quicksort(arr, si, pid - 1);
    quicksort(arr, pid + 1, ei);
  }

  public static int partition(int arr[], int si, int ei) {

    int pivot = arr[ei];
    int i = si - 1;
    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

      }
    }

    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;
  }

}
