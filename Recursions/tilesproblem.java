
public class tilesproblem {

  public static void main(String[] args) {
    System.out.println("welcome to tiling proplem");

    System.out.println(tilingp(4));

  }

  public static int tilingp(int n) {
    // base condition

    if (n == 1 || n == 0) {
      return 1;

    }

    // this for verticle condition
    int t1 = tilingp(n - 1);

    // this is for horizental condition

    int t2 = tilingp(n - 2);

    int total = t1 + t2;

    return total;
  }

}