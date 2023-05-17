package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 알고리즘수업_너비우선탐색1 {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int count = 0;

    public static void bfs(int r, boolean[] visited, int[] result) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(r);
        visited[r] = true;
        result[r] = ++count;
        while(!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                    result[y] = ++count;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

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
        int[] result = new int[n + 1];

        bfs(r, visited, result);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
