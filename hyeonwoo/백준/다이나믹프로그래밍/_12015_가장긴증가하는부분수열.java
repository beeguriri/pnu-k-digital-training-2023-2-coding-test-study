package 백준.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _12015_가장긴증가하는부분수열 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int cnt =0;
        int temp = nums[0]; // 제일 앞의 수

        for (int i = 1; i < n ; i++) {
            
        }
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

//        int[] a = new int[1000000];
//        int cnt=0;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = 1;
//            cnt ++;
//        }

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println(secDiffTime);

    }
}
