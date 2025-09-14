public class Butterfly {
  public static void main(String[] args) {

    int row = 8;
    int col = 8;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {

        if ((j <= i || j >= (col - i - 1)) && i <= row / 2) {
          System.out.print(" * ");

        } else if (i > row / 2 && (j < (row - i) || j >= i)) {
          System.out.print(" * ");

        }

        else {
          System.out.print("   ");
        }

      }
      System.out.println();
    }
  }
}
