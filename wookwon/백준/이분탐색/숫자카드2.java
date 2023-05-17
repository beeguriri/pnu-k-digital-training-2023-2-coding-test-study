package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자카드2 { // upper bound, lower bound로 다시 풀 것
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); // getOrDefault - 키에 해당하는 값 있으면 그거 반환, 없으면 기본값 반환. 여기서는 없으므로 기본값 0에 + 1 해서 1반환됨
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(query, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
