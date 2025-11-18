public class Rotcutting {// unbounded kapsack

  public static int Rodcutting(int len[], int price[], int W) {
    int n = price.length;
    int dp[][] = new int[n + 1][W + 1];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 0;

    }

    for (int j = 0; j < dp[0].length; j++) {
      dp[0][j] = 0;

    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < W + 1; j++) {
        int v = price[i - 1];
        int w = len[i - 1];

        if (w <= j) {
          int iPro = v + dp[i][j - w];
          int exPro = dp[i - 1][j];
          dp[i][j] = Math.max(iPro, exPro);
        } else {
          int exPro = dp[i - 1][j];
          dp[i][j] = exPro;

        }

      }

    }
    return dp[n][W];
  }

  public static void main(String[] args) {
    System.out.println("welcome to rod cutting");

    int len[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
    int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };

    int rodlength = 8;

    System.out.println(Rodcutting(len, price, rodlength));
  }
}
