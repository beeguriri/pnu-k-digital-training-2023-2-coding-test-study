package 백준.Week03_BinarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2776_암기왕 {
    public static int upperbound(int[] nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int middle = (start + end) / 2;

            if ( nums[middle] <= target) { // 오른쪽부분
                start = middle + 1 ; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

    // target 의 첫번째 인덱스 반환
    // 배열에 값이 없으면 target 보다 큰, 제일 작은 수의 인덱스 반환
    public static int lowerbound(int[] nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int middle = (start + end) / 2;
            // 배열에 숫자가 있으면 1 반환
            if (nums[middle] < target) { // 왼쪽부분
                start = middle + 1; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

    public static int binsearch(int[] a ,int target){
        int s = 0;
        int e = a.length-1;
        while(s <= e){
            int mid = (s + e) /2;
            if (target == a[mid]) return 1;// 있으면 1 반환
            if(target < a[mid] ){ // 왼쪽 부분
                e = mid - 1;
            }else s = mid + 1;
        }
        return 0; // 없으면 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());
//        int t = sc.nextInt();
//        int k =0;
//        while (true){// testcase 갯수

//            if(k == t) break;

        for (int y = 0; y < t; y++) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
//            int n = sc.nextInt();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] note1 = new int[n];
            for (int i = 0; i < n; i++) {
                note1[i] = Integer.parseInt(st.nextToken());
//                note1[i] = sc.nextInt();
            }

            int m = Integer.parseInt(br.readLine());
//            int m = sc.nextInt();
            st = new StringTokenizer(br.readLine());
            int[] note2 = new int[m];
            for (int i = 0; i < m; i++) {
                note2[i] = Integer.parseInt(st.nextToken());
//                note2[i] = sc.nextInt();
            }


            Arrays.sort(note1);
//            for (int i = 0; i < n; i++) {
//                System.out.print(note1[i] + " ");
//            }
//            System.out.println();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < m; i++) {
//                bw.write(binsearch(note1,note2[i]) +"\n");
//                int a =upperbound(note1, note2[i]);
//                int b = lowerbound(note1, note2[i]);
//
//                if(a == b) System.out.println(1);
//
//                else System.out.println(0);
                sb.append(binsearch(note1,note2[i])).append("\n");
            }
            System.out.print(sb.toString());
//        bw.close();
//        k++;
        }
    }
}
