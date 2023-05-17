package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와BFS {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < graph.get(v).size(); i++) {
            int x = graph.get(v).get(i);
            if (!visited[x]) {
                dfs(x, visited);
            }
        }
    }

    public static void bfs(int v, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        System.out.print(v + " ");
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    System.out.print(y + " ");
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] visited = new boolean[n + 1];

        dfs(v, visited);

        System.out.println();

        visited = new boolean[n + 1];


        bfs(v, visited);
    }
}
