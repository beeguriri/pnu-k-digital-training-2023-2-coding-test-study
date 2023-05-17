package 교재.Week02_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _24479_알고리즘수업DFS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 수
        int m = Integer.parseInt(st.nextToken()); // 간선의 수
        int start = Integer.parseInt(st.nextToken());
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return Integer.compare(o1[1],o2[1]);
                return Integer.compare(o1[0],o2[0]);
            }
        });


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int[] temp = new int[2];
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a < b
            if(a > b){
                int t = a;
                a= b;
                b= t;
            }
            temp[0] =a;
            temp[1] =b;
            pq.add(temp);
        }

        while (!pq.isEmpty()){
            System.out.println(pq.peek()[0] + " : " +pq.peek()[1]);
            pq.poll();
        }
    }
}
