import java.util.*;

public class cycleDectionDirected {

  public static class Edge {
    int src, dest, wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

  public static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    // true
    // graph[0].add(new Edge(0, 2, 1));
    // graph[1].add(new Edge(1, 0, 1));

    // graph[2].add(new Edge(2, 3, 1));

    // graph[3].add(new Edge(3, 0, 1));
    // false

    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));
    graph[1].add(new Edge(1, 3, 1));

    graph[2].add(new Edge(2, 3, 1));

  }

  public static boolean isCycle(ArrayList<Edge>[] graph) {

    boolean vis[] = new boolean[graph.length];
    boolean stack[] = new boolean[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        if (isCycleUtill(graph, i, vis, stack)) {
          return true;

        }

      }

    }

    return false;

  }

  // utill
  public static boolean isCycleUtill(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {

    vis[curr] = true;
    stack[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (stack[e.dest]) {
        // cycle
        return true;

      }

      if (!vis[e.dest] && isCycleUtill(graph, e.dest, vis, stack)) {
        return true;

      }

    }
    stack[curr] = false;
    return false;

  }

  public static void main(String[] args) {
    System.out.println("Welcome to adjacency list implementation");

    int V = 4;
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph);

    System.out.println(isCycle(graph));

  }
}
