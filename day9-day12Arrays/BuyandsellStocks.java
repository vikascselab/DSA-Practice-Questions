import java.util.Scanner;

class BuyandsellStocks {
  public static void main(String[] args) {
    System.out.println("Welcome to Buy and selll stocks ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    // int[] Lmin = new int[marks.length];

    // Lmin[0] = marks[0];

    // for (int i = 1; i < marks.length; i++) {

    // Lmin[i] = Math.min(marks[i], Lmin[i - 1]);

    // }

    // int profit = 0;

    // for (int i = 0; i < marks.length; i++) {
    // profit = 0;
    // profit = marks[i] - Lmin[i];

    // System.out.println("Maximau profit Day " + (i + 1) + " is " + profit);

    // }

    int buyingPrices = Integer.MAX_VALUE;

    int maxProfit = 0;

    for (int i = 0; i < marks.length; i++) {

      if (buyingPrices < marks[i]) {

        int profit = marks[i] - buyingPrices;

        maxProfit = Math.max(maxProfit, profit);

      } else {
        buyingPrices = marks[i];
      }

    }

    System.out.println("Maximum price is " + maxProfit);

  }
}
