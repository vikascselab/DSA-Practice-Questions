
import java.util.Scanner;

class arrayFunction {

  public static void main(String[] args) {
    System.out.println("Welcome to arrays function");
    Scanner Input = new Scanner(System.in);
    System.out.println(" Enter the size of arrays");

    int size = Input.nextInt();

    int arrays[] = new int[size];

    System.out.println("Enter the arrays elements");

    Arraysinput(arrays);

    System.out.println("this is arrays elements");
    Arraysoutput(arrays);

  }

  public static void Arraysinput(int[] arry) {
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter the Array Element");
    for (int i = 0; i < arry.length; i++) {
      arry[i] = Input.nextInt();
    }
  }

  public static void Arraysoutput(int[] arry) {
    System.out.println("This is Array Element");
    for (int i = 0; i < arry.length; i++) {

      System.out.println(arry[i]);
    }

  }

}
