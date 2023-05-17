package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//틀렸다
public class 나무자르기 {
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
        int max = arr[arr.length - 1];

        int start = 0;
        int end = max;


        while (start <= end) {
            int mid = (start + end) / 2;
            int count = getCount(arr, mid);
            if (count == n) {
                int sum = findAnswer(arr, mid);
                if (sum >= m) {
                    // mid가 작게 잘렸다는 뜻이니까 mid를 키워줘야 함
                    start = mid + 1;
                } else {
                    //mid가 크게 잘렸다는 뜻이므로  mid를 줄여야함
                    end = mid - 1;
                }
            } else if (count > n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);

    }

    public static int findAnswer(int[] arr, int mid) {
        int sum = 0;
        for (int a : arr) {
            if (a < mid) {
                continue;
            } else {
                sum = sum + (a - mid);
            }
        }
        return sum;
    }

    public static int getCount(int[] arr, int mid) {
        int count = 0;
        for (int a : arr) {
            if (a < mid) {
                count++;
            } else {
                if (mid == 0) { // mid가 0인 경우를 예외 처리
                    count = Integer.MAX_VALUE; // 최대값으로 설정하여 while문에서 빠져나오도록 함
                } else {
                    count = count + (a / mid);
                }
            }


        }
        return count;
    }
}
