package 백준.Week02_정렬;

import java.io.*;
import java.util.*;

public class _11651_좌표정렬하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
//        int[] nums = new int [n];
        List<int[]> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] temp = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            nums.add(temp);
        }

        // 입력 확인
//        for (int[] a: nums) {
//            System.out.println(a[0] + " , "+ a[1]);
//        }

        Collections.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int[] a: nums) {
            bw.write(a[0] + " "+ a[1]+"\n");
        }
        bw.close();
    }
}
