package 백준.Week03_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class _2512_예산 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        Arrays.sort(nums);

        int s = 0;
        int e = nums[nums.length-1]; // 제일 마지막

        int answer = 0;
//        int temp = 0;
        while(s <= e) {
            int count = 0;
            int mid = (s + e) / 2;
            int temp = Arrays.binarySearch(nums, mid);
            if(temp < 0) temp = (-temp) -1;


            count += (nums.length - temp) * mid;

            for (int i = 0; i < temp; i++) {
                count +=  nums[i];
            }
            if(count <= sum){ //  부족하면? 더 키워야함 오른쪽 확인

                if(s == (e-1)) {
                    s = e;
                    continue;
                }
                s = mid ;
                if(answer <= mid) answer = mid;

            } else e = mid-1;
//            System.out.println(mid);
            if(s == e) break;
        }
        System.out.println(answer);

    }
}
