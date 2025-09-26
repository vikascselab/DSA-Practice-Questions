class mergsort {

  public static void printarrays(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("Welcome to merge sort");
    int arr[] = { 6, 3, 9, 5, 2, 8 };
    printarrays(arr);

    mergsort(arr, 0, arr.length - 1);

    printarrays(arr);

  }

  public static void mergsort(int arr[], int si, int ei) {

    if (si == ei) {
      return;

    }

    int mid = si + (ei - si) / 2;
    mergsort(arr, si, mid); /// left
    mergsort(arr, mid + 1, ei); /// right

    merg(arr, si, mid, ei);
  }

  public static void merg(int arr[], int si, int mid, int ei) {

    int temp[] = new int[ei - si + 1];

    int i = si; /// this is for left
    int j = mid + 1; /// this is for right
    int k = 0; /// this is for temp

    while (i <= mid && j <= ei) {

      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;

      } else {

        temp[k] = arr[j];
        j++;

      }
      k++;

    }
    /// for left
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    /// for right
    ///
    while (j <= ei) {
      temp[k++] = arr[j++];

    }

    /// copy to temp array to original arrays

    for (k = 0, i = si; k < temp.length; k++, i++) {

      arr[i] = temp[k];

    }
  }

}
