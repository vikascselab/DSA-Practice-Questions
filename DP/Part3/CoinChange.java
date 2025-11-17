public class CoinChange {

  public static int Coinchange(int coins[], int target) {
    int n = coins.length;
    int dp[][] = new int[n + 1][target + 1];

    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 1;

    }
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i] = 0;

    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < target + 1; j++) {
        // include

        int v = coins[i - 1];

        if (v <= j) {
          dp[i][j] = dp[i][j - v] + dp[i - 1][j];

        } else {
          dp[i][j] = dp[i - 1][j];
        }

      }
    }
    return dp[n][target];
  }

  public static void main(String[] args) {
    System.out.println("welcome to target sum ");

    int coins[] = { 2, 5, 3, 6 };
    int target = 10;

    System.out.println(Coinchange(coins, target));
  }

}
