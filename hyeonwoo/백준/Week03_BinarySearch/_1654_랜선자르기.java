package 백준.Week03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1654_랜선자르기 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 원하는 갯수

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            nums[i] = temp;
        }
        Arrays.sort(nums);

        int s = 0;
        int e = nums[nums.length - 1];

        while (s < e) {
            long sum = 0; // 자른 갯수 확인하는 정수
            int mid = (s+e) /2;
//            if(mid > nums[0]) mid = nums[0];
//            int temp = nums[nums.length-1] / mid; // 마지막 값은 얼마나 나눌수 있는가?
//            int[] t = new int[temp];
//            for (int i = 0; i < temp; i++) { //
//                int bs_val = Arrays.binarySearch(nums, i*mid);
//                if(bs_val == -1) bs_val =0;
//                else if (bs_val < 0) bs_val = bs_val*(-1) -1;
//                t[i] = Arrays.binarySearch(nums, i*mid);
//            }
            for (int i : nums) {
                sum += i / mid;
            }
            if (sum < m) { // 부족하면?
                e = mid;
            } // 크거나 같으면  ==> upperbound
            else s = mid + 1;

            if(s == e) System.out.println(e-1);
        }

        int k = (int) Math.pow(2,31) -1;
        System.out.println(k);

    }
}
