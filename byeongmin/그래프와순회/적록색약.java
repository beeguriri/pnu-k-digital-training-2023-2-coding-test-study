package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 적록색약 {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void bfs(String[][] arr, boolean[][] visited, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        visited[x][y] = true;
        String s = arr[x][y];
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[nx].length)
                    continue;

                if (arr[nx][ny].equals(s) && !visited[nx][ny]) {
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void bfs2(String[][] arr, boolean[][] visited, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        visited[x][y] = true;
        String s = arr[x][y];
        if (s.equals("G"))
            s = "R";
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[nx].length)
                    continue;

                if (arr[nx][ny].equals("G"))
                    arr[nx][ny] = "R";

                if (arr[nx][ny].equals(s) && !visited[nx][ny]) {
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = s[j];
            }
        }
        boolean[][] visited = new boolean[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(arr, visited, i, j);
                    count++;
                }
            }
        }
        System.out.print(count + " ");

        visited = new boolean[n][n];
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs2(arr, visited, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
