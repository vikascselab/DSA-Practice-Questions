
import java.util.*;

class activity {

  public static void main(String[] args) {
    System.out.println("welcomt to gready world");

    int str[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };

    // if given is not sorted

    int activity[][] = new int[str.length][3];

    for (int i = 0; i < str.length; i++) {
      activity[i][0] = i;
      activity[i][1] = str[i];
      activity[i][2] = end[i];

    }

    // lamda function
    Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

    // end time basic sorted
    int maxA = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    // first
    maxA = 1;
    ans.add(activity[0][0]);
    int last = activity[0][2];

    for (int i = 1; i < end.length; i++) {

      if (activity[i][1] >= last) {
        maxA++;
        ans.add(activity[i][0]);

        last = activity[i][2];
      }

    }

    System.out.println("maxmium activity " + maxA);
    for (int i = 0; i < ans.size(); i++) {
      System.out.println("A" + ans.get(i));

    }
  }

}
