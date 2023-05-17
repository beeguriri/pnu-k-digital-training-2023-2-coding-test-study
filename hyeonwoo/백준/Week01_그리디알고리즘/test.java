package 백준.Week01_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static int upperbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;

            if (nums.get(middle) <= target) { // 오른쪽부분
                start = middle + 1; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

    public static int lowerbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;
            // 배열에 숫자가 있으면 1 반환
            if (nums.get(middle) < target) { // 왼쪽부분
                start = middle + 1; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] s1 = s.split("-"); // 배열

        List<String[]> s2 = new ArrayList<>();

        for (int i = 0; i < s1.length; i++) {
            s2.add(s1[i].split("\\+"));
        }
//        Integer a = Integer.parseInt(s1[0]);

//        for (int i = 1; i < s1.length; i++) {
//            a -= Integer.parseInt(s1[i]);
//        }
        int a =0;
        for (int i = 0; i < s2.size(); i++) {
            if (i ==0) {
                for (int j = 0; j < s2.get(i).length; j++) {
                    a += Integer.parseInt(s2.get(i)[j]);
                }

            }
            else{
                for (int j = 0; j < s2.get(i).length; j++) {

                    a -= Integer.parseInt(s2.get(i)[j]);
                }
            }
        }
        System.out.println(a);

    }

}
