import java.util.*;

public class Main2 {
    public static void main(String[] arg) {
        System.out.println("welcome");

        Scanner Input = new Scanner(System.in);

        String str = Input.nextLine();

        String ch[] = str.split(",");

        ArrayList<Integer> arr = new ArrayList<>();

        for (String token : ch) {
            int num = Integer.parseInt(token);
            arr.add(num);
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}