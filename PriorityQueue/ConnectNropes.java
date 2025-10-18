import java.util.PriorityQueue;

class ConnectNropes {

  public static void main(String[] args) {
    System.out.println("welcome  to connect n ropes");

    int ropes[] = { 2, 3, 3, 4, 6 };

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i = 0; i < ropes.length; i++) {
      pq.add(ropes[i]);

    }

    int cost = 0;
    while (pq.size() > 1) {
      int min1 = pq.remove();
      int min2 = pq.remove();

      cost += min1 + min2;
      pq.add(min1 + min2);

    }

    System.out.println("minimum cost of ropes= " + cost);

  }

}
