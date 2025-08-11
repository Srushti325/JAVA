import java.util.*;
public class GraphsCode {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // add edges
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        ArrayList<Edge> graph [] = new ArrayList[V];
        creatGraph(graph);
        // Print neighbours
        System.out.print("Enter the vertix who's neighbour's need to be printed: ");
        int x = sc.nextInt();
        for(int i=0; i<graph[x].size(); i++) {
            Edge e = graph[x].get(i);
            System.out.println(e.dest);
        }
    }
}
