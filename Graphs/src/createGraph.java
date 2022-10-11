import java.util.ArrayList;
import java.util.Scanner;

public class createGraph {

    static class Edge {
        int src;
        int nbr;
        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        ArrayList<Edge> [] adj = new ArrayList[v];

        for(int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }

        int e = sc.nextInt();
        for(int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj[v1].add(new Edge(v1, v2));
            adj[v2].add(new Edge(v2, v1));
        }
        int src = sc.nextInt();
        int dst = sc.nextInt();

        boolean []visited = new boolean[v];
        boolean path = hasPath(adj, src, dst, visited);
        System.out.println(path);
    }
    public static boolean hasPath(ArrayList<Edge>[] adj,int src, int dst, boolean []visited) {
        if(src == dst) {
            return true;
        }

        visited[src] = true;
        for(Edge edge : adj[src]) {
            if(!visited[edge.nbr]) {
                boolean hasNbrPath = hasPath(adj, edge.nbr, dst, visited);
                if(hasNbrPath) {
                    return true;
                }
            }
        }
        return false;
    }
}
