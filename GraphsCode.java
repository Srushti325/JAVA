// Unweighted Graph
// import java.util.*;
// public class GraphsCode {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void creatGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         // add edges
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 2));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 2));
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of vertices: ");
//         int V = sc.nextInt();
//         ArrayList<Edge> graph [] = new ArrayList[V];
//         creatGraph(graph);
//         // Print neighbours
//         System.out.print("Enter the vertix who's neighbour's need to be printed: ");
//         int x = sc.nextInt();
//         for(int i=0; i<graph[x].size(); i++) {
//             Edge e = graph[x].get(i);
//             System.out.println(e.dest);
//         }
//     }
// }

// Weighted Graph
// import java.util.*;
// public class GraphsCode {
//     static class Edge {
//         int src;
//         int dest;
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void creatGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         // add edges
//         graph[0].add(new Edge(0, 2, 2));

//         graph[1].add(new Edge(1, 2, 3));
//         graph[1].add(new Edge(1, 3, -1));

//         graph[2].add(new Edge(2, 0, 2));
//         graph[2].add(new Edge(2, 1, 3));
//         graph[2].add(new Edge(2, 3, 10));

//         graph[3].add(new Edge(3, 1, -1));
//         graph[3].add(new Edge(3, 2,));
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of vertices: ");
//         int V = sc.nextInt();
//         ArrayList<Edge> graph [] = new ArrayList[V];
//         creatGraph(graph);
//         // Print neighbours
//         System.out.print("Enter the vertix who's neighbour's need to be printed: ");
//         int x = sc.nextInt();
//         for(int i=0; i<graph[x].size(); i++) {
//             Edge e = graph[x].get(i);
//             System.out.println(e.dest);
//         }
//     }
// }


// BFS
// import java.util.*;
// public class GraphsCode {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void creatGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         // add edges
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));
        
//     }

//     public static void bfs(ArrayList<Edge>[] graph, int V) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean visited[] = new boolean[V];
//         q.add(0);

//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             if(visited[curr] == false) {
//                 System.out.print(curr + " ");
//                 visited[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int V = 7;
//         ArrayList<Edge> graph [] = new ArrayList[V];
//         creatGraph(graph);

//         bfs(graph, V);
//     }
// }


// BFS Disconnected Graph
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
        
    }

    public static void bfs(ArrayList<Edge>[] graph, int V, boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);

        while(!q.isEmpty()) {
            int curr = q.remove();
            if(visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge> graph [] = new ArrayList[V];
        creatGraph(graph);
        boolean visited[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if(visited[i] == false) {
                bfs(graph, V, visited, i);
            }
        }
    }
}