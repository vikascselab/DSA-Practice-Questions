import java.util.*;

public class graph {

  public static class Edge {
    int src, dest, wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

  public static void CreateGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    // 0 vertex
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));
    // 1 vertex
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));
    // 2 vertex
    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 4, 1));
    // 3 vertex
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));
    graph[3].add(new Edge(3, 5, 1));
    // 4 vertex
    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));
    graph[4].add(new Edge(4, 5, 1));
    // 5 vertex
    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));
    // 6 vertex
    graph[6].add(new Edge(6, 5, 1));
  }

  public static void bfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        bfsUtill(graph, vis);
      }

    }
  }

  public static void bfsUtill(ArrayList<Edge>[] graph, boolean vis[]) {
    Queue<Integer> q = new LinkedList<>();

    q.add(0);

    while (!q.isEmpty()) {
      int curr = q.remove();
      if (!vis[curr]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (Edge e : graph[curr]) {
          q.add(e.dest);
        }
      }
    }
  }
  // Dfs

  public static void dfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        dfsUtill(graph, i, vis);
      }

    }
  }

  public static void dfsUtill(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
    System.out.println(curr + " ");
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        dfsUtill(graph, e.dest, vis);

      }

    }
  }

  // hash path
  // public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest,
  // boolean vis[]) {

  // if (src == dest) {
  // return true;

  // }

  // vis[src] = true;
  // for (int i = 0; i < graph[src].size(); i++) {
  // Edge e = graph[src].get(i);
  // // e.dest= neighbor
  // if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
  // return true;

  // }

  // }
  // return false;
  // }

  public static void main(String[] args) {
    System.out.println("Welcome to adjacency list implementation");

    int V = 7;
    ArrayList<Edge>[] graph = new ArrayList[V];
    CreateGraph(graph);

    // System.out.println("BFS traversal:");
    // bfs(graph, 0);

    // dfs(graph, 0, new boolean[V]);
    System.out.println(hasPath(graph, 0, 5, new boolean[V]));

  }
}
