package 백준.이분탐색;

import java.util.*;
import java.io.*;

public class 나무자르기2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 나무의 수
        int m = Integer.parseInt(input[1]); // 필요한 나무의 길이
        int[] tree = new int[n]; // 나무의 높이를 저장할 배열
        input = br.readLine().split(" ");
        int max_height = 0; // 최대 절단기 높이
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(input[i]);
            max_height = Math.max(max_height, tree[i]); // 나무 높이 중 최대값을 구함
        }

        long left = 0; // 절단기 높이의 최소값
        long right = max_height; // 절단기 높이의 최대값
        long answer = 0; // 최대 절단기 높이

        while (left <= right) {
            long mid = (left + right) / 2; // 절단기 높이의 중간값
            long sum = 0; // 잘린 나무의 길이 합계

            // 절단기 높이가 mid일 때, 잘린 나무의 길이 합계 구하기
            for (int i = 0; i < n; i++) {
                if (tree[i] > mid) {
                    sum += tree[i] - mid;
                }
            }

            // 잘린 나무의 길이 합계가 필요한 나무의 길이보다 크거나 같으면
            // 절단기 높이(mid)를 높여야 하므로 left를 mid+1로 갱신
            if (sum >= m) {
                answer = Math.max(answer, mid); // 최대 절단기 높이 갱신
                left = mid + 1;
            }
            // 잘린 나무의 길이 합계가 필요한 나무의 길이보다 작으면
            // 절단기 높이를 낮춰야 하므로 right를 mid-1로 갱신
            else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}

