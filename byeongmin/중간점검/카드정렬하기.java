package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            pq.offer(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while (pq.size() > 1) {
            long c1 = pq.poll();
            long c2 = pq.poll();

            sum += c1 + c2;
            pq.offer(c1 + c2);
        }
        System.out.println(sum);
    }
}
