class updateithbit {

  public static void main(String[] args) {
    System.out.println("Wecome to update");

    System.out.println(updatebit(10, 2, 1));
  }

  public static int updatebit(int n, int i, int newbit) {

    if (newbit == 0) {
      return clearithbit.clearbit(n, i);

    } else {
      return setbit.setbit(n, i);
    }
  }

}
