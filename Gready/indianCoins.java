import java.util.*;

class indianCoins {

  public static void main(String[] args) {
    System.out.println("welcome to india coins");

    Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

    Arrays.sort(coins, Comparator.reverseOrder());

    int numcoins = 0;
    int amount = 590;

    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < coins.length; i++) {
      if (coins[i] <= amount) {
        while (coins[i] <= amount) {
          numcoins++;

          ans.add(coins[i]);
          amount -= coins[i];

        }

      }

    }

    System.out.println("no of coins use " + numcoins);
    for (int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i));

    }
  }

}
