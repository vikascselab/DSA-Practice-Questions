import java.util.*;

public class countingBst {

  // recursion

  // catalan no finding is equal to findign the no of bst

  public static int catlanN(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    int ans = 0;

    for (int i = 0; i <= n - 1; i++) {

      ans += catlanN(i) * catlanN(n - i - 1);

    }

    return ans;
  }

  // memoization
  public static int catlanNM(int n, int dp[]) {
    if (n == 0 || n == 1) {
      return 1;
    }

    if (dp[n] != -1) {
      return dp[n];

    }

    int ans = 0;

    for (int i = 0; i <= n - 1; i++) {

      ans += catlanN(i) * catlanN(n - i - 1);

    }

    return dp[n] = ans;
  }

  // tabulation

  public static int catlanTab(int n) {
    int dp[] = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < i; j++) {

        dp[i] += dp[j] * dp[i - j - 1];

      }

    }
    return dp[n];
  }

  public static void main(String[] args) {
    System.out.println("welcome to catalan number");

    // System.out.println(catlanN(4));

    int n = 4;

    // int dp[] = new int[n + 1];
    // Arrays.fill(dp, -1);

    // System.out.println(catlanNM(n, dp));

    System.out.println(catlanTab(n));
  }

}
