import java.util.*;

public class matrixchain {
  // recursion
  public static int mcm(int arr[], int i, int j) {
    if (i == j) {
      return 0;

    }

    int ans = Integer.MAX_VALUE;

    for (int k = i; k <= j - 1; k++) {
      int cost1 = mcm(arr, i, k);
      int cost2 = mcm(arr, k + 1, j);
      int cost3 = arr[i - 1] * arr[k] * arr[j];

      int finalcost = cost1 + cost2 + cost3;

      ans = Math.min(ans, finalcost);

    }

    return ans;
  }

  // memoization
  public static int mcmM(int arr[], int i, int j, int dp[][]) {
    if (i == j) {
      return 0;

    }

    if (dp[i][j] != -1) {
      return dp[i][j];

    }

    int ans = Integer.MAX_VALUE;

    for (int k = i; k <= j - 1; k++) {
      int cost1 = mcmM(arr, i, k, dp);
      int cost2 = mcmM(arr, k + 1, j, dp);
      int cost3 = arr[i - 1] * arr[k] * arr[j];

      int finalcost = cost1 + cost2 + cost3;

      ans = Math.min(ans, finalcost);

    }

    return dp[i][j] = ans;
  }

  public static void main(String[] args) {
    System.out.println("welcome to mcm");

    int arr[] = { 1, 2, 3, 4, 3 };
    int n = arr.length;

    // System.out.println(mcm(arr, 1, n - 1));

    int dp[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], -1);

    }

    System.out.println(mcmM(arr, 1, n - 1, dp));

  }

}
