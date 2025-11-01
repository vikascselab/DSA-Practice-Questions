
import java.util.*;

public class AdjacencyList {

  public static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt) {
      this.src = src;
      this.dest = dest;
      this.wt = wt;
    }
  }

  public static void CreateGraph(ArrayList<Edge> graph[]) {

    // int arr[]= new int[V];

    for (int i = 0; i < V; i++) {
      graph[i] = new ArrayList<>();

    }
    // 0 vertex
    graph[0].add(new Edge(0, 1, 1));
    // 1 vertex
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));

    // 2 vertex
    graph[2].add(new Edge(2, 1, 2));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 4));

    // 3 verte3
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));

    // vertex 4

    graph[4].add(new Edge(4, 2, 2));

    for (int i = 0; i < graph[2].size(); i++) {

      Edge e = graph[2].get(i);

      System.out.println(e.dest);
    }

  }

  public static void main(String[] args) {
    System.out.println("welcome to implementaion for adjacencyList");

    int V = 5;
    ArrayList<Edge> graph[] = new ArrayList[V];
    CreateGraph(graph);

  }

}
