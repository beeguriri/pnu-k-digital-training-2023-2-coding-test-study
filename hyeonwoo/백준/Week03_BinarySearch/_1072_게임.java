package 백준.Week03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1072_게임 {
    public static void main(String[] args) throws IOException {

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int z = y * 100 / x;
//        int one_per = x/100;

        double rate = (double) y * 100 / x;
//        System.out.println(x + " " + y + " " + z);

//        int a = 1000000000;
        int e = 2*x;
        int s =0;
        int answer = 2*x;
        while (s <= e){
            if (rate == 99 | rate == 100){
                System.out.println(-1);
                break;
            }
            if (x < 100 ) {
                System.out.println(1);
                break;
            }
            int m = (s +e) / 2;

            // 승률 증가한 곳중에 최소점
            if ((int) rate < (int) cal_rate(x,y,m)) {
                if (answer >= m)  answer = m;
                if(s==e){
                    System.out.println(answer);
                    break;
                }
                e = m;
            }
            else {
                s = m+1;
            }
//            answer =m;


        }


//        int cnt = 0;
//        if (x == y) cnt = -1;
//        if (x!=y ) {
//            while (z == rate) {
//                x++;
//                y++;
//                cnt++;
//                rate = y * 100 / x;
//            }
//        }
//        System.out.println(x + " " + y + " " + rate);



        //실험할 코드 추가
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : " + secDiffTime);
    }

    public static double cal_rate(int x,int y, int a){
        return (double) 100*(y+a)/(x+a);
    }



}
