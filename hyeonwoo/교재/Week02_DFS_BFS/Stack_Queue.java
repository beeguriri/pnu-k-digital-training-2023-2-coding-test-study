package 교재.Week02_DFS_BFS;

import java.util.*;

public class Stack_Queue {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();
        // 스택의 최상단 원소부터 출력
//        while (!s.empty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
        
        // 큐 생성 링크드 리스트
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();
        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
        }

        // 큐 생성 어레이디큐
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(5);
        q1.add(2);
        q1.add(3);
        q1.add(7);
        q1.poll();
        q1.add(1);
        q1.add(4);
        q1.poll();
        System.out.println();
//        while(!q1.isEmpty()){
//            System.out.print(q1.poll()+ " ");
//        }





    }



}
