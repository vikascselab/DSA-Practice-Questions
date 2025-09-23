package Recursions;

class fibnonacchi {

  public static void main(String[] args) {

    System.out.println("welcome to fibnacci");

    System.out.println(fib(5000));

  }

  public static int fib(int n) {
    if (n == 0 || n == 1) {

      return n;

    }

    int fin = fib(n - 1) + fib(n - 2);
    return fin;
  }

}
