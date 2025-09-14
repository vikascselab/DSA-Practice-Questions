import java.util.Scanner;

class printrect {

  public static void main(String[] args) {

    System.out.println("enter row and column");

    Scanner Input = new Scanner(System.in);
    int row = Input.nextInt();
    int col = Input.nextInt();

    printRect(row, col);

  }

  public static void printRect(int row, int col) {

    for (int i = 1; i <= row; i++) {

      for (int j = 1; j <= col; j++) {

        if (i == 1 || i == row || j == 1 || j == col) {
          System.out.print(" *");

        } else {

          System.out.print("  ");
        }

      }
      System.out.println();

    }

  }

}
