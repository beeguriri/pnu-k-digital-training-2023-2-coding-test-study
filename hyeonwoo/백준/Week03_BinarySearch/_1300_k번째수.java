package 백준.Week03_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1300_k번째수 {


    /*
    * 세준이는 크기가 N×N인 배열 A를 만들었다.
    *  배열에 들어있는 수 A[i][j] = i×j 이다.
    *  이 수를 일차원 배열 B에 넣으면 B의 크기는 N×N이 된다. B를 오름차순 정렬했을 때, B[k]를 구해보자.
    *  배열 A와 B의 인덱스는 1부터 시작한다.
    * */
    static List<Integer> b;
    public static void main(String[] args) {

        // 주대각선 기준 좌우로 2번씩 같은 숫자가 나옴( 주대각선 숫자랑 겹칠수 있음)


        // 다이나믹 프로그래밍 인가?



        // 배열 B 를 다 만들어야 하는가? 
        // 만들면 시간초과
        Scanner sc =new Scanner(System.in);

//        int n = sc.nextInt();
//        int k = sc.nextInt();

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        //실험할 코드 추가

        int n = 10000;
        b = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j < n ; j++) {
                b.add(i*j);
                b.add(i*j);
            }
            b.add(i*i);
        }
        Collections.sort(b);

        System.out.println(b);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println(secDiffTime);
    }
}
