package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
    
        // 이거 int 하니까 틀리네
        long start = 0;
        long end = arr[arr.length - 1];
        long answer = 0; // 최대 절단기 높이

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mid) {
                    sum += arr[i] - mid;
                }
            }

            // sum이 더 크다는 것은 mid가 작다는 뜻. mid를 높여야함
            if (sum >= m) {
                // 절단기의 높이 가장 높은 걸로 갱신 - 이게 없으면 틀리는데 사실 왜 하는지 모르겠다
                answer = Math.max(answer, mid);
                start = mid + 1;
            } else {
                // sum이 더 작다는 것은 mid가 크다는 뜻이므로 mid 줄여야 함.
                end = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
