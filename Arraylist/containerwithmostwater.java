import java.util.ArrayList;
import java.util.List;

class containerwithmostwater {

  public static void main(String[] args) {
    System.out.println("Welcome to contsiner with most water");

    ArrayList<Integer> height = new ArrayList<>();

    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(mostwater(height));

  }

  // public static int mostwater(ArrayList<Integer> height) {
  // int max = 0;
  // /// this is broute force apporach
  // for (int i = 0; i < height.size(); i++) {
  // for (int j = 0; j < height.size(); j++) {

  // int ht = Math.min(height.get(i), height.get(j));
  // int wt = j - i;

  // int currw = ht * wt;
  // max = Math.max(max, currw);

  // }

  // }
  // return max;
  // }

  public static int mostwater(ArrayList<Integer> height) {

    int max = 0;

    int st = 0;
    int end = height.size() - 1;

    while (st < end) {

      int ht = Math.min(height.get(st), height.get(end));

      int wt = end - st;

      int currw = ht * wt;

      max = Math.max(max, currw);

      if (height.get(st) < height.get(end)) {

        st++;

      } else {
        end--;
      }

    }
    return max;
  }

}
