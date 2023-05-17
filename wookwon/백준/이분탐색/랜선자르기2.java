package 백준.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 랜선자르기2 {
    public static void main(String[] args) {
        /*
        1. 입력받은 랜선의 길이와 개수를 저장합니다.
        2. 랜선의 길이 중 최솟값과 최댓값을 설정합니다.
        3. 최솟값과 최댓값을 이용하여 이진 탐색을 수행합니다.
        4. 이진 탐색에서 중간값을 구하고, 그 값을 이용하여 랜선을 잘랐을 때 얻어지는 개수를 구합니다.
        5. 구한 개수가 필요한 개수보다 크거나 같으면, 중간값 이후의 범위에서 탐색을 계속합니다.
        6. 구한 개수가 필요한 개수보다 작으면, 중간값 이전의 범위에서 탐색을 계속합니다.
        7. 최솟값과 최댓값이 같아질 때까지 이진 탐색을 반복하며, 그 때의 중간값을 출력합니다.
        */

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] lan = new int[k];
        for (int i = 0; i < k; i++) {
            lan[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(lan);

        long start = 1; // start 1인 이유? end가 0이 되면 mid가 0이 되는 것 방지
        long end = getMax(lan);

        while (start <= end) {
            long mid = (start + end) / 2;
            int count = getCount(lan, mid);
            if (count >= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }

    private static int getCount(int[] lan, long length) {
        int count = 0;
        for (int l : lan) {
            count += l / length;
        }
        return count;
    }

    private static long getMax(int[] arr) {
        long max = 0;
        for (int a : arr) {
            max = Math.max(max, a);
        }
        return max;
    }
}
