class rotatedsortedarray {
  public static void main(String[] args) {
    System.out.println("welcome to rotated binary search");

    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    int index = search(arr, target, 0, arr.length - 1);

    System.out.println("Index of " + target + ": " + index);
  }

  public static int search(int arr[], int target, int si, int ei) {
    if (si > ei) {
      return -1;
    }

    int mid = si + (ei - si) / 2;

    if (arr[mid] == target) {
      return mid;
    }

    // Check if left half is sorted
    if (arr[si] <= arr[mid]) {
      // Case 1: target lies in left half
      if (arr[si] <= target && target <= arr[mid]) {
        return search(arr, target, si, mid - 1);
      } else {
        return search(arr, target, mid + 1, ei);
      }
    }
    // Otherwise, right half must be sorted
    else {
      // Case 2: target lies in right half
      if (arr[mid] <= target && target <= arr[ei]) {
        return search(arr, target, mid + 1, ei);
      } else {
        return search(arr, target, si, mid - 1);
      }
    }
  }
}
