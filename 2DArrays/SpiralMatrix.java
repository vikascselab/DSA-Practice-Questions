import java.util.Scanner;

class SpiralMatrix {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to 2D arrays");

    System.out.print("Enter the size of rows: ");
    int row = input.nextInt();

    System.out.print("Enter the size of columns: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];

    Repre.Arraysin(matrix, input);

    int startRow = 0;
    int startCol = 0;
    int endrow = matrix[0].length - 1;
    int endcol = matrix[0].length - 1;

    while (startRow <= endrow && startCol <= endcol) {

      // top

      for (int j = startCol; j <= endcol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }

      // right

      for (int i = startRow + 1; i <= endrow; i++) {
        System.out.print(matrix[i][endcol] + " ");

      }

      // bottom

      for (int j = endcol - 1; j >= startCol; j--) {

        if (startRow == endrow) {
          break;
        }

        System.out.print(matrix[endrow][j] + " ");
      }

      // left

      for (int i = endrow - 1; i >= startRow + 1; i--) {

        if (startCol == endcol) {
          break;

        }

        System.out.print(matrix[i][startCol] + " ");

      }
      System.out.println();
      startRow++;
      startCol++;
      endcol--;
      endrow--;

    }

    System.out.println(matrix);
  }

}