import java.util.Scanner;

class Repre {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to 2D arrays");

    System.out.print("Enter the size of rows: ");
    int row = input.nextInt();

    System.out.print("Enter the size of columns: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];

    Arraysin(matrix, input);
    Arraysout(matrix);

    input.close();
  }

  public static void Arraysin(int[][] matrix, Scanner input) {
    int n = matrix.length;
    int m = matrix[0].length;

    System.out.println("Enter the 2D array elements (" + n + "x" + m + "):");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("Element [" + i + "][" + j + "]: ");
        matrix[i][j] = input.nextInt();
      }
    }
  }

  public static void Arraysout(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    System.out.println("\nThe 2D array is:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
