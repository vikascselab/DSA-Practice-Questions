import java.util.Scanner;

public class TrapingrainWater {

  public static void main(String[] args) {
    System.out.println("Welcome to Traping rain water ");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the size of array");

    int size = Input.nextInt();

    int[] marks = new int[size];

    arrayFunction.Arraysinput(marks);

    // First cout the Left max and Right max

    int[] Rmax = new int[marks.length];
    int[] Lmax = new int[marks.length];

    Lmax[0] = marks[0];

    for (int i = 1; i < marks.length; i++) {

      Lmax[i] = Math.max(marks[i], Lmax[i - 1]);

    }

    Rmax[marks.length - 1] = marks[marks.length - 1];

    for (int i = marks.length - 2; i >= 0; i--) {

      Rmax[i] = Math.max(marks[i], Rmax[i + 1]);
    }

    // for traped water

    int trapedWater = 0;

    for (int i = 0; i < marks.length; i++) {

      int WaterLevel = Math.min(Lmax[i], Rmax[i]);

      trapedWater += WaterLevel - marks[i];
    }

    System.out.println("Traped water is " + trapedWater);

  }
}