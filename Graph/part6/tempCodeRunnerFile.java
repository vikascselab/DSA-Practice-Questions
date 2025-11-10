
import java.util.*;

public class kosarajualgo {

  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  // Create graph
  public static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));
    graph[1].add(new Edge(1, 0));
    graph[2].add(new Edge(2, 1));
    graph[3].add(new Edge(3, 4));
  }

  // Step 1: Topological sort (DFS)
  public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
    visited[curr] = true;
    for (Edge e : graph[curr]) {
      if (!visited[e.dest]) {
        topSort(graph, e.dest, visited, stack);
      }
    }
    stack.push(curr);
  }

  // dfs
  public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
    visited[curr] = true;
    System.out.print(curr + " ");
    for (Edge e : graph[curr]) {
      if (!visited[e.dest]) {
        dfs(graph, e.dest, visited);
      }
    }
  }

  public static void kosaraju(ArrayList<Edge>[] graph, int V) {
    // Step 1: Topological sort
    Stack<Integer> stack = new Stack<>();
    boolean[] visited = new boolean[V];
    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        topSort(graph, i, visited, stack);
      }
    }

    // Step 2: Transpose graph
    ArrayList<Edge> transpose[] = new ArrayList[V];
    for (int i = 0; i < graph.length; i++) {
      visited[i] = false;
      transpose[i] = new ArrayList<Edge>();

    }
    for (int i = 0; i < V; i++) {
      for (int j = 0; j < graph[i].size(); j++) {
        Edge e = graph[i].get(j);
        transpose[e.dest].add(new Edge(e.dest, e.src));

      }

    }

    // step 3

    while (!stack.isEmpty()) {
      int curr = stack.pop();
      if (!visited[curr]) {
        dfs(transpose, curr, visited);
        System.out.println();

      }

    }

  }

  public static void main(String[] args) {
    System.out.println("Welcome to Kosaraju's Algorithm");
    int V = 5;
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph);
    kosaraju(graph, V);
  }
}
