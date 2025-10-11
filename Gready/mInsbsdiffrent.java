import java.util.Arrays;

class mInsbsdiffrent {

  public static void main(String[] args) {
    System.out.println("welcome to min absolute ");

    int[] A = { 1, 2, 3 };
    int[] B = { 2, 1, 3 };

    Arrays.sort(A);
    Arrays.sort(B);

    int minabs = 0;
    for (int i = 0; i < A.length; i++) {

      minabs += Math.abs(A[i] - B[i]);

    }
    System.out.println("min abs is " + minabs);
  }

}
