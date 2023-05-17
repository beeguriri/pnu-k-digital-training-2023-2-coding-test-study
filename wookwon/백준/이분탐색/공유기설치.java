package 백준.이분탐색;

import java.util.*;
import java.io.*;

public class 공유기설치 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 집의 개수
        int c = Integer.parseInt(input[1]); // 공유기의 개수
        int[] house = new int[n]; // 집의 좌표를 저장할 배열
        for (int i = 0; i < n; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house); // 집의 좌표를 오름차순으로 정렬

        int left = 1; // 최소 간격
        int right = house[n-1] - house[0]; // 최대 간격
        int answer = 0; // 가장 인접한 두 공유기 사이의 최대 거리

        while (left <= right) {
            int mid = (left + right) / 2; // 공유기 사이의 간격
            int count = 1; // 설치한 공유기 개수
            int prev_house = house[0]; // 이전에 공유기를 설치한 집의 좌표
            for (int i = 1; i < n; i++) {
                if (house[i] - prev_house >= mid) {
                    count++;
                    prev_house = house[i];
                }
            }

            if (count >= c) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
