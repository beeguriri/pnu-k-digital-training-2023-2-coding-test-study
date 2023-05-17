package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 알파벳 {
    public static List<Integer> list;
    public static int count = 0;
    public static int max = 0;
    public static void dfs(int[][] arr, boolean[][] visited, int x, int y) {

        if (x < 0 || y < 0 || x >= arr.length || y >= arr[x].length)
            return;

        if (list.contains(arr[x][y]) || visited[x][y])
            return;

        count++;
        list.add(arr[x][y]);
        visited[x][y] = true;
        dfs(arr, visited,x - 1, y);
        dfs(arr, visited, x, y + 1);
        dfs(arr, visited,x + 1, y);
        dfs(arr, visited, x,y - 1);

        max = Math.max(max, count);
        visited[x][y] = false;
        list.remove(list.size() - 1);
        count--;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] arr = new int[r][c];
        boolean[][] visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j) - 'A';
            }
        }

        list = new ArrayList<>();
        dfs(arr, visited, 0, 0);

        System.out.println(max);
    }
}
