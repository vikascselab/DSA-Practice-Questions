
import java.util.ArrayList;

class towDarraylist {

  public static void main(String[] args) {

    System.out.println("welcome to 2d array list");
    ///////// this is two arraylist
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);

    mainlist.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();

    list.add(3);
    list.add(4);

    mainlist.add(list2);
    ///// for printing 2d array list

    for (int i = 0; i < mainlist.size(); i++) {

      ArrayList<Integer> currlist = mainlist.get(i);
      for (int j = 0; j < currlist.size(); j++) {
        System.out.print(currlist.get(j) + " ");

      }

      System.out.println();

    }

    System.out.println(mainlist);

  }
}
