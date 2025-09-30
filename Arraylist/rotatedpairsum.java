import java.util.ArrayList;

class rotatedpairsum {
  public static void main(String[] args) {
    System.out.println("welcome to pair sum");

    // also we can try by brute force

    ArrayList<Integer> height = new ArrayList<>();

    height.add(11);
    height.add(15);
    height.add(6);
    height.add(8);
    height.add(9);
    height.add(10);

    System.out.println(pairsum(height, 50));

  }

  public static boolean pairsum(ArrayList<Integer> list, int target) {

    int bp = -1;

    int n = list.size();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) > list.get(i + 1)) { /// this is breaking point

        bp = i;
        break;

      }
    }

    int lp = bp + 1;
    int rp = bp;

    while (lp != rp) {

      if (list.get(lp) + list.get(rp) == target) {

        return true;

      }

      if (list.get(lp) + list.get(rp) < target) {

        lp = (lp + 1) % n;

      } else {
        rp = (n + rp - 1) % n;
      }

    }

    return false;

  }

}
