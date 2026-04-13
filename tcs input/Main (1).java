import java.util.*;

public class Main {
    public static void main(String[] arg) {
        System.out.println("hi it is nice to meet you");
        Scanner Input = new Scanner(System.in);

        int n = Input.nextInt();
        // int arr[] = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // arr[i]=Input.nextInt();
            arr.add(Input.nextInt());
        }

        // for(int i=0; i<arr.length; i++){
        // System.out.println(arr[i]);
        // }
        for (int v : arr) {
            System.out.println(v);
        }

    }
}