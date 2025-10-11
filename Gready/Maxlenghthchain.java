import java.util.Arrays;
import java.util.Comparator;

class Maxlenghthchain {
  public static void main(String[] args) {
    System.out.println("welcome to max  length chain of pair");
    int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

    Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

    int chainL = 1;
    int endcahin = pair[0][1];

    for (int i = 1; i < pair.length; i++) {
      if (pair[i][0] >= endcahin) {

        chainL++;
        endcahin = pair[i][1];

      }

    }

    System.out.println("number of chain is = " + chainL);
  }

}
