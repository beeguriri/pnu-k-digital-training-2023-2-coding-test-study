package 백준.Week03_BinarySearch;

import java.io.*;
import java.util.*;

public class _10816_숫자카드2 {
    // target 의 마지막 인덱스 +1  반환
    // target 이 배열에 없으면 target 보다 큰, 가장 작은 수의 인덱스 반환
    public static int upperbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;

            if ( nums.get(middle) <= target) { // 오른쪽부분
                start = middle + 1 ; // 찾아도 다음값으로 (상계)
            } else {
                end = middle;
            }
        }
        return end;
    }

    // target 의 첫번째 인덱스 반환
    // 배열에 값이 없으면 target 보다 큰, 제일 작은 수의 인덱스 반환
    public static int lowerbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;
            // 배열에 숫자가 있으면 1 반환
            if (nums.get(middle) < target) { // 오른쪽부분   
                start = middle + 1; 
            } else {
                end = middle; // 타깃을 찾아도 end => mid 로 가서 왼쪽 확인 (하계)
            }
        }
        return end;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bt = new BufferedWriter(new OutputStreamWriter(System.out));

        // 가지고 있는 숫자 카드

        int n = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }


        // 비교해야할 숫자카드
        int m = Integer.parseInt(br.readLine());
        List<Integer> targets = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            targets.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);
//        System.out.println(Collections.binarySearch(nums, 10));


//         Collections.binarySearch
//        for (int i = 0; i < targets.size(); i++) {
//            System.out.println(Collections.binarySearch(nums, targets.get(i)));
//        }
        for (int i = 0; i < targets.size(); i++) {
//            int cnt = 0;
//            System.out.print(upperbound(nums, targets.get(i)) - lowerbound(nums, targets.get(i)) + " ");
            System.out.println(lowerbound(nums, targets.get(i)));
            System.out.println(upperbound(nums, targets.get(i)));
//            bt.write(upperbound(nums, targets.get(i)) - lowerbound(nums, targets.get(i)) + " ");

        }
        bt.close();
    }
}

