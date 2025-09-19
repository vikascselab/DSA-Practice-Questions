import java.util.Scanner;

class SerchingBest {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to 2D arrays");

    System.out.print("Enter the size of rows: ");
    int row = input.nextInt();

    System.out.print("Enter the size of columns: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];

    Repre.Arraysin(matrix, input);

    int key = 33;
    int ro = 0;
    int co = matrix[0].length - 1;

    while (ro < matrix.length && col >= 0) {

      if (matrix[ro][co] == key) {

        System.out.println("Element found at index " + ro + "," + co);
        break;

      } else if (key < matrix[ro][co]) {

        co--;

      } else {
        ro++;
      }

    }

    System.out.println("Key not found");

  }
}
