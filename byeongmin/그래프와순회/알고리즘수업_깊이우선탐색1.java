package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 알고리즘수업_깊이우선탐색1 {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int[] result = new int[100001];
    public static int count = 0;

    public static void dfs(int r, boolean[] visited) {
        visited[r] = true;
        result[r] = ++count;
        for (int i = 0; i < graph.get(r).size(); i++) {
            int x = graph.get(r).get(i);
            if (!visited[x])
                dfs(x, visited);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];

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

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        dfs(r, visited);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
