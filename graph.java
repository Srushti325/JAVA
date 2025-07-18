import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Edge>[] adjList; // Adjacency list representation of the graph

    // Edge class representing an edge between two nodes with a weight
    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        adjList[src].add(new Edge(dest, weight));
        adjList[dest].add(new Edge(src, weight)); // For undirected graph
    }

    // Dijkstra's algorithm
    public void dijkstra(int src) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(e -> e.weight));
        int[] dist = new int[vertices]; // Distance array

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Edge(src, 0));

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.dest;

            for (Edge neighbor : adjList[u]) {
                int v = neighbor.dest;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Edge(v, dist[v]));
                }
            }
        }

        // Print the distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1, 9);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 4, 3);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 4);

        int source = 0;
        System.out.println("Dijkstra's Algorithm (starting from vertex " + source + "):");
        graph.dijkstra(source);
    }
}
