package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질 {
    public static int[] moves = {-1, 1, 0};
    public static void bfs(int[] data, int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        data[x] = 1;
        while (!q.isEmpty()) {
            x = q.poll();
            for (int i = 0; i < moves.length; i++) {
                int nx;
                if (moves[i] != 0)
                    nx = moves[i] + x;
                else
                    nx = x * 2;

                if (nx < 0 || nx > data.length)
                    continue;
                if (data[nx] == 0) {
                    data[nx] = data[x] + 1;
                    q.offer(nx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] data = new int[100001];

        bfs(data, n, m);

        System.out.println(data[m] - 1);
    }
}
