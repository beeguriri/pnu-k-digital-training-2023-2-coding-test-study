package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 단지번호붙이기 {
    public static ArrayList<Integer> countArray = new ArrayList<>();
    public static int count = 0;

    public static void dfs(int[][] data, int x, int y) {
        if (x < 0 || y < 0 || x >= data.length || y >= data[x].length)
            return;
        if (data[x][y] == 0)
            return;
        data[x][y] = 0;
        count += 1;
        dfs(data, x - 1, y);
        dfs(data,x + 1, y);
        dfs(data, x, y - 1);
        dfs(data, x, y + 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[][] data = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                data[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0){
                    dfs(data, i, j);
                    countArray.add(count);
                    count = 0;
                }
            }
        }
        System.out.println(countArray.size());
        Collections.sort(countArray);
        for (int i : countArray) {
            System.out.println(i);
        }
    }
}
