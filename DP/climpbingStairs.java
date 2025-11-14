import java.util.*;

public class climpbingStairs {
  // using recursion
  public static int climbing(int n) {

    if (n == 0) {
      return 1;

    }
    if (n < 0) {
      return 0;

    }

    // if (n == 1 || n == 2) {
    // return n;

    // }

    return climbing(n - 1) + climbing(n - 2);
  }

  // memoization
  public static int fibm(int n, int f[]) {

    if (n == 0) {
      return 1;

    }
    if (n < 0) {
      return 0;

    }

    if (f[n] != 0) {
      return f[n];

    }
    f[n] = fibm(n - 1, f) + fibm(n - 2, f);
    return f[n];
  }

  // tabualtion

  public static int fibt(int n, int dp[]) {

    dp[0] = 1;
    // dp[1] = 1;

    for (int i = 1; i <= n; i++) {

      if (i == 1) {
        dp[i] = dp[i - 1];

      } else {
        dp[i] = dp[i - 1] + dp[i - 2];

      }

    }

    int ans = dp[n];
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("welcome to climbing stairs");

    int n = 5;
    // System.out.println(climbing(n));
    int dp[] = new int[n + 1];

    // Arrays.fill(dp, -1);
    // System.out.println(fibm(n, dp));

    System.out.println(fibt(n, dp));

  }

}
