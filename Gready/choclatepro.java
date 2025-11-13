import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class choclatepro {
  public static void main(String[] args) {
    System.out.println("welcome to choclate pro");
    int n = 4, m = 6;
    Integer costVar[] = { 2, 1, 3, 1, 4 }; // m-1
    Integer costHar[] = { 4, 1, 2 }; // n-1

    Arrays.sort(costVar, Collections.reverseOrder());
    Arrays.sort(costHar, Collections.reverseOrder());

    int h = 0, v = 0;
    int hp = 1, vp = 1;
    int cost = 0;

    while (h < costHar.length && v < costVar.length) {

      if (costVar[v] <= costHar[h]) {

        // horizenal cuts
        cost += (costHar[h] + vp);
        hp++;
        h++;
      } else {
        cost += (costVar[v] + hp);
        vp++;
        v++;
      }

    }

    while (h < costHar.length) {
      cost += (costHar[h] + vp);
      hp++;
      h++;

    }

    while (v < costVar.length) {

      cost += (costVar[v] + hp);
      vp++;
      v++;

    }

    System.out.println("mimum cost of " + cost);

  }

}
