package 교재.다이나믹프로그래밍;

public class _1로만들기 {

    static int[] memo = new int[30001];
    public static void main(String[] args) {
        /*
        * X 정수 의 연산은 4개
        *  5로 나누어 떨어지면 5로나눈다
        *  3로 나누어 떨어지면 3로나눈다
        *  2로 나누어 떨어지면 2로나눈다
        *  1을 뺀다
        *
        * 4개 연산을 적절히 사용해 1로 만드려한다. 연산횟수의 최솟값을 구하라
        * */

        // 뺄셈을 최대한 적게 나눗셈을 많이

        // 메모이제이션?
        // 각 정수가 연산되는 최솟값을 기록? ex 5(1) (이미 기록된 답) 이라서 6(2) 이고 7(3)
        // 예를 들어 5 => 1, 6 => (6-1) /5

        System.out.println(setMemo(30));
    }
    static int setMemo(int a){ // 5보다 큰 값 a 에 대해서
        if(a <= 5) return -1;
        // TODO 나누어 떨어지더라도
        //  바로 나눈 인덱스 값으로 갈지 -1을 해야 빠른지 확얀해봐야함
        // 백준 1463 12852 27440

        memo[2] = 1;
        memo[3] = 1;
        memo[4] = 2;
        memo[5] = 1;
        for (int i = 6; i <= a; i++) {
            if (i % 5 == 0) {
                memo[i] = memo[i / 5] + 1; // 나누어떨어진 정수에 답이 있으면 +1 해서 호출
            } else if (i % 3 == 0) {
                memo[i] = memo[i / 3] + 1;
            } else if (i % 2 == 0) {
                memo[i] = memo[i / 2] + 1;
            } else memo[i] = memo[i - 1] + 1; // 나누어 떨어지는거 아니면 앞 숫자 에 +1
//        memo[a] = 1;

        }
        return memo[a];
    }

}
