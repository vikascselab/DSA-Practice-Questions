import java.util.*;

public class CycleInGraph {

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

    // ✅ Graph with NO cycle
    graph[0].add(new Edge(0, 1, 1));
    graph[1].add(new Edge(1, 0, 1));

    graph[1].add(new Edge(1, 2, 1));
    graph[2].add(new Edge(2, 1, 1));

    graph[1].add(new Edge(1, 3, 1));
    graph[3].add(new Edge(3, 1, 1));

    graph[2].add(new Edge(2, 4, 1));
    graph[4].add(new Edge(4, 2, 1));

    graph[3].add(new Edge(3, 5, 1));
    graph[5].add(new Edge(5, 3, 1));
  }

  public static boolean detectCycle(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        if (detectCycleUtil(graph, vis, i, -1)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
    vis[curr] = true;

    for (Edge e : graph[curr]) {
      // Case 1: go to unvisited neighbor
      if (!vis[e.dest]) {

        if (detectCycleUtil(graph, vis, e.dest, curr)) { // here is problem
          return true;
        }
      }
      // Case 2: visited neighbor that is NOT parent → cycle
      else if (e.dest != par) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Welcome to adjacency list implementation");

    int V = 6;
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph);

    if (detectCycle(graph)) {
      System.out.println("Cycle detected in the graph.");
    } else {
      System.out.println("No cycle found in the graph.");
    }
  }
}
