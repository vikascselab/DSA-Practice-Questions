import java.util.PriorityQueue;

public class PQforObject {

  static class Student implements Comparable<Student> { // overide
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
      return this.rank - s2.rank;
    }
  }

  public static void main(String[] args) {
    System.out.println("welcoem to pq for object");

    PriorityQueue<Student> p = new PriorityQueue<>();

    p.add(new Student("A", 4));
    p.add(new Student("b", 3));
    p.add(new Student("g", 1));
    p.add(new Student("l", 5));

    while (!p.isEmpty()) {

      System.out.println(p.peek().name + "->" + p.peek().rank);
      p.remove();

    }

  }

}
