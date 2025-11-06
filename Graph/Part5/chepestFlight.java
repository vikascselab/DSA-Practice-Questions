import java.util.*;

public class chepestFlight {

  public static class Edge {
    int src, dest, wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

  static class Info {
    int v;
    int cost;
    int stops;

    public Info(int v, int cost, int stops) {
      this.v = v;
      this.cost = cost;
      this.stops = stops;
    }
  }

  public static void createGraph(int flights[][], ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0; i < flights.length; i++) {
      int scr = flights[i][0];
      int dest = flights[i][1];
      int wt = flights[i][2];

      Edge e = new Edge(scr, dest, wt);
      graph[scr].add(e);

    }

  }

  public static int chepestFlight(int n, int flights[][], int src, int dest, int k) {
    ArrayList<Edge> graph[] = new ArrayList[n];
    createGraph(flights, graph);

    int dist[] = new int[n];
    for (int i = 0; i < n; i++) {
      if (i != src) {
        dist[i] = Integer.MAX_VALUE;

      }

    }
    Queue<Info> q = new LinkedList<>();
    q.add(new Info(src, 0, 0));

    while (!q.isEmpty()) {
      Info curr = q.remove();
      if (curr.stops > k) {
        break;

      }
      for (int i = 0; i < graph[curr.v].size(); i++) {
        Edge e = graph[curr.v].get(i);
        int u = e.src;
        int v = e.dest;
        int wt = e.wt;
        if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <= k) {

          dist[v] = curr.cost + wt;
          q.add(new Info(v, dist[v], curr.stops + 1));

        }

      }

    }

    if (dist[dest] == Integer.MAX_VALUE) {
      return -1;

    } else {
      return dist[dest];
    }

  }

  public static void main(String[] args) {
    System.out.println("Welcome to cheapest  flights");

    int n = 4;
    int flights[][] = { { 0, 1, 100 }, { 1, 2, 200 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
    int scr = 0, dest = 3, k = 1;

    int ans = chepestFlight(n, flights, scr, dest, k);
    System.out.println("ans is " + ans);

  }
}
