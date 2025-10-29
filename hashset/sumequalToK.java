import java.util.HashMap;

public class sumequalToK {
  public static void main(String[] args) {
    System.out.println("welcome to sum of k");

    int arr[] = { 10, 2, -2, -20, 10 };

    int k = -10;
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int ans = 0;

    for (int j = 0; j < arr.length; j++) {
      sum += arr[j];
      if (map.containsKey(sum - k)) {
        ans += map.get(sum - k);

      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    System.out.println("ans is =" + ans);
  }

}
