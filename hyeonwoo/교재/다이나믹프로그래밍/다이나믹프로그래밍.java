package 교재.다이나믹프로그래밍;

public class 다이나믹프로그래밍 {

    // 다이나믹 프로그래밍 각 부분문제가 서로 영향을 미치고 중복된다.
    // ex 피보나치
    
    // 분할 정복 중복되지 않음
    // ex 퀵 정렬에서 한번 자리잡은 피벗은 다시 호출되지 않음

    static long[] fibo = new long[100];

    public static void main(String[] args) {
        fibo[1] = 1;
        fibo[2] = 1;

        System.out.println(fibonacci(3));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(50));
        System.out.println(fibonacci(20));
        System.out.println(fibonacci(42));
        System.out.println(fibonacci(36));
    }
    public static long fibonacci(int a) {

        for (int i = 3; i < a+1; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[a];
    }
}
