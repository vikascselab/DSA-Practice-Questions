import java.util.ArrayList;

public class pairsum {
  public static void main(String[] args) {
    System.out.println("welcome to pair sum");

    // also we can try by brute force

    ArrayList<Integer> height = new ArrayList<>();

    height.add(1);
    height.add(2);
    height.add(3);
    height.add(4);
    height.add(5);
    height.add(6);

    System.out.println(pairsum(height, 15));

  }

  public static boolean pairsum(ArrayList<Integer> height, int target) {

    int lp = 0;
    int rp = height.size() - 1;

    while (lp < rp) {

      if (height.get(lp) + height.get(rp) == target) {

        return true;

      } else if (height.get(lp) + height.get(rp) < target) {

        lp++;

      } else {
        rp--;
      }

    }

    return false;

  }

}
