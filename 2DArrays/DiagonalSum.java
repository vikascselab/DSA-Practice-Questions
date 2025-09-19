import java.util.Scanner;

class DiagonalSum {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to 2D arrays");

    System.out.print("Enter the size of rows: ");
    int row = input.nextInt();

    System.out.print("Enter the size of columns: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];

    Repre.Arraysin(matrix, input);
    int sum = 0;

    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j <= matrix[0].length; j++) {
    // if (i == j) {

    // sum += matrix[i][j];

    // }

    // else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];

    // }
    // }
    // }

    for (int i = 0; i < matrix.length; i++) {
      sum = sum + matrix[i][i];

      if (i != matrix.length - 1 - i) {

        sum = sum + matrix[i][matrix.length - 1 - i];
      }

    }

    System.out.println("sum of diagonal is" + sum);
  }

}