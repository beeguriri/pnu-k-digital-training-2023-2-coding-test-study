package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두용액 {

    public static int ans1;
    public static int ans2;

    public static void binarySearch(int[] arr, int start, int end) {
        int result = Integer.MAX_VALUE;
        while (start < end) {
            int temp = Math.abs(arr[start] + arr[end]);
            if (result > temp) {
                ans1 = arr[start];
                ans2 = arr[end];
                result = temp;
                if (temp == 0)
                    break;
            }

            if (arr[start] + arr[end] > 0)
                end--;
            else
                start++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        binarySearch(arr, 0, n - 1);

        System.out.println(ans1 + " " + ans2);
    }
}
