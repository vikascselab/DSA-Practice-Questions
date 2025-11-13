class Nqueenall {

  public static void main(String[] args) {
    System.out.println("Welcome to nq problem");
    int n = 2;
    char board[][] = new char[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        board[i][j] = 'x';
      }
    }

    Nqall(board, 0);

  }

  public static void Printarray(char[][] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {

        System.out.print(arr[i][j] + " ");
      }

      System.out.println();
    }
  }

  public static void Nqall(char board[][], int row) {

    if (row == board.length) {
      Printarray(board);
      return;
    }

    for (int j = 0; j < board.length; j++) {

      board[row][j] = 'Q';
      Nqall(board, row + 1); // function
      board[row][j] = 'x'; // backtraking
    }

  }

}
