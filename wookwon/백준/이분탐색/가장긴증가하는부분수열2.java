package 백준.이분탐색;

import java.io.*;
import java.util.*;

public class 가장긴증가하는부분수열2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        list.add(a[0]);

        for (int i = 1; i < n; i++) {
            int x = a[i];
            if (x > list.get(list.size() - 1)) {
                list.add(x);
            } else {
                int idx = Collections.binarySearch(list, x);
                if (idx < 0) {
                    idx = -idx - 1;
                }
                list.set(idx, x);
            }
        }

        System.out.println(list.size());
    }
}
