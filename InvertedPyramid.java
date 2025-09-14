public class InvertedPyramid {
  public static void main(String[] args) {

    int row = 4;
    int col = 4;

    for (int i = 0; i < row; i++) {

      for (int j = 0; j < col; j++) {

        if (i + j > 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
}
