package Assignment2;
import java.util.*;
public class Q1_BFS {
    public static void main(String[] args) {
        int[][] graph = {{0, 1, 1}, {1, 0, 0}, {1, 0, 0}};
        bfs(graph, 0);
    }

    public static void bfs(int[][] graph, int start) {
        int n = graph.length; 
        boolean[] visited = new boolean[n]; 
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " "); 

            for (int i = 0; i < n; i++) {
                if (graph[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }
}
