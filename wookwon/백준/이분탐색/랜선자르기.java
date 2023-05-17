package 백준.이분탐색;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];

        // 랜선의 길이를 입력 받음과 동시에 최댓값 구함
        int max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        Arrays.sort(arr);

        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            int count = getCount(arr, (int)mid);
            if (count >= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);

    }

    public static int getCount(int[] arr, int mid) {
        int count = 0;
        for (int a : arr) {
            count = count + (a / mid);
        }
        return count;
    }
}
