import java.util.Scanner;

class searching {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to 2D arrays");

    System.out.print("Enter the size of rows: ");
    int row = input.nextInt();

    System.out.print("Enter the size of columns: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];

    Repre.Arraysin(matrix, input);
    // Repre.Arraysout(matrix);

    Search(matrix, 2);

  }

  public static boolean Search(int[][] matrix, int key) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Element is found at " + i + "," + j);
          return true;

        }

      }
    }
    return false;

  }
}