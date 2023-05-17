package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 예산 {

    public static StringBuilder binarySearch(int[]arr, int m){
        int start = 0;
        int end = arr[arr.length - 1];
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            for (int money : arr) {
                if (money >= mid) sum += mid;
                else sum += money;
            }
            if (sum > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, m));

    }
}
