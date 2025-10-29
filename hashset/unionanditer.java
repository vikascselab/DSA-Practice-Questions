import java.util.HashSet;

public class unionanditer {
  public static void main(String[] args) {
    System.out.println("welcome to union and itersection");

    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };
    /// union of two arrays
    HashSet<Integer> hs = new HashSet<>();
    // for (int i = 0; i < arr1.length; i++) {
    // hs.add(arr1[i]);

    // }
    // for (int i = 0; i < arr2.length; i++) {
    // hs.add(arr2[i]);

    // }

    // System.out.println("uinon of two arrays is = " + hs.size());
    int cout = 0;
    for (int i = 0; i < arr1.length; i++) {
      hs.add(arr1[i]);

    }
    for (int i = 0; i < arr2.length; i++) {
      if (hs.contains(arr2[i])) {
        cout++;
        hs.remove(arr2[i]);

      }

    }
    System.out.println("total insertion element is " + cout);

  }

}
