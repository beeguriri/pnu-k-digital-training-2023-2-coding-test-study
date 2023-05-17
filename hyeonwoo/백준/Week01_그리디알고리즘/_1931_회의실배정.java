package 백준.Week01_그리디알고리즘;

import jdk.jshell.SourceCodeAnalysis;

import java.util.*;

public class _1931_회의실배정 {

    /*한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
     각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할
      수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가
       끝나는 것과 동시에 다음 회의가 시작될 수 있다.
    회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int[][] nums = new int[n][2];
//        Arrays.sort(nums);

        List<int[]> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] temp = {x, y};
//            list2.add(i)[0] = x;
            list2.add(temp);
        }

        // 정렬 종료시간을 기준으로 내림차순
        Collections.sort(list2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) { // 종료시간 같으면 시작시간 오름차순
                    return Integer.compare(o1[0] , o2[0]);
                }
                return Integer.compare(o1[1] , o2[1]);
            }
        });

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)[0] + " ");
            System.out.println(list2.get(i)[1]);
        }


        for (int i = 0; i < list2.size() - 1; i++) {
            if(list2.get(i)[0] == list2.get(i+1)[0] ){
                int a = list2.get(i)[1] - list2.get(i)[0];
                int b = list2.get(i+1)[1] - list2.get(i+1)[0];
//                if (a < b)
            }
        }

        
//        // 중복제거
//        for (int i = 0; i <list2.size() ; i++) {
//
//        }

//        List<time> list = new ArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            list.add(new time(x, y));
//        }
//        Collections.sort(list, new Comparator<time>() {
//            // x값 기준 오름차순 정렬
//            // x값 같으면 y 기준 오름차순 정렬
//            @Override
//            public int compare(time o1, time o2) {
//                if (o1.getX() == o2.getX()) {
//                    return o1.getY() - o2.getY();
//                }
//                return o1.getX() - o2.getX();
//            }
//        });

//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).getX() == list.get(i - 1).getX() &&
//                    list.get(i).getY() >= list.get(i - 1).getY()) {
//                list.remove(list.get(i));
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Stack<time> st = new Stack<>();
//            st.push(list.get(i));
//
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(j).getX() >= st.peek().getY()) {
//                    st.push(list.get(j));
//                }
//            }
//

//            System.out.println("stack size = " + st.size());
//            if(st.size() > max)  max = st.size();
        }

    public class time {
        int x;
        int y;

        @Override
        public String toString() {
            return "time{ x= " + x +
                    ", y = " + y +
                    '}';
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public time(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
