package 백준.Week03_BinarySearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
public class _10815_숫자카드 {
    public static int binSearch(List<Integer> nums, int target){
        int start = 0 ;
        int end = nums.size()-1;
        int middle = (start+end)/2;

        while (start<= end){
            if (nums.get(middle) == target) return 1;
            if(nums.get(middle) < target) {
                start = middle +1;
                middle = (start+end)/2;
            }else {
                end = middle -1;
                middle = (start+end)/2;
            }

        }
        return 0;
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

        for (int i = 0; i < targets.size(); i++) {
//            System.out.println(binSearch(nums, targets.get(i)));
            bt.write(binSearch(nums, targets.get(i)) + " ");
        }
        bt.close();
    }
}

