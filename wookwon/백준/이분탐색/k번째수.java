package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class k번째수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 배열 크기
        int k = Integer.parseInt(br.readLine()); // k번째 수

        // 이분 탐색을 위한 left, right 초기값 설정
        long left = 1;
        long right = k;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0; // mid보다 작은 수의 개수를 저장할 변수

            // mid보다 작은 수의 개수를 구하기 위한 반복문
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }

            if (cnt >= k) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
