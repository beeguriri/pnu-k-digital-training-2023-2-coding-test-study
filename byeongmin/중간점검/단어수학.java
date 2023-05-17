package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어수학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                alpha[s.charAt(j) - 'A'] += Math.pow(10, s.length() - j - 1);
            }
        }

        Arrays.sort(alpha);

        int answer = 0;
        int x = 9;
        for (int i = alpha.length - 1; i >= 0; i--) {
            if (alpha[i] != 0)
                answer += (alpha[i] * x--);
        }

        System.out.println(answer);
    }
}

