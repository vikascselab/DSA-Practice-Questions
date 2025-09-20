class Findsortestpath {

  public static void main(String[] args) {
    System.out.println("welcoome to sortest path");

    String path = "WNEENESENNN";

    getpath(path);

    System.out.println(getpath(path));

  }

  public static double getpath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      int n = path.charAt(i);
      if (n == 'S') {

        y--;

      } else if (n == 'N') {
        y++;

      } else if (n == 'W') {

        x--;

      } else {
        x++;
      }

    }

    int X2 = x * x;
    int Y2 = y * y;

    return Math.sqrt(X2 + Y2);

  }

}
