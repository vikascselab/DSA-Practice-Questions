import java.util.*;

public class countdistielement {

  public static void coutdis(int arr[]) {
    HashSet<Integer> hs = new HashSet<>();
    int dis = 0;

    for (int i = 0; i < arr.length; i++) {
      hs.add(arr[i]);

    }

    for (Integer integer : hs) {
      dis++;
      System.out.print(integer + " ");

    }

    System.out.println("number of element is = " + dis);
  }

  public static void main(String[] args) {
    System.out.println("welcome to countdistinct element");

    int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

    coutdis(arr);
  }

}
