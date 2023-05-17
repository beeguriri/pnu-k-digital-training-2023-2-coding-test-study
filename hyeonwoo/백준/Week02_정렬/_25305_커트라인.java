package 백준.Week02_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class _25305_커트라인 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        System.out.println(nums[nums.length - k]);
    }
}
