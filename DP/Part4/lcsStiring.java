
public class lcsStiring {

  // Tabulation

  public static int lscS(String str1, String str2) {
    int n = str1.length();
    int m = str2.length();

    int dp[][] = new int[n + 1][m + 1];
    int ans = 0;

    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < m + 1; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        }
      }
    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < m + 1; j++) {
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
          ans = Math.max(ans, dp[i][j]);

        } else {
          // int ans1 = dp[i - 1][j];
          // int ans2 = dp[i][j - 1];
          // dp[i][j] = Math.max(ans1, ans2);
          dp[i][j] = 0;
        }
      }

    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("welcome to longest comman sub string");

    String str1 = "abcde";
    String str2 = "abgce";

    System.out.println(lscS(str1, str2));

  }
}
