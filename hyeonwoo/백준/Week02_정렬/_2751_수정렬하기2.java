package 백준.Week02_정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class _2751_수정렬하기2 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
            bw.write(nums[i] + "\n");
        }
        bw.close();
    }
}
