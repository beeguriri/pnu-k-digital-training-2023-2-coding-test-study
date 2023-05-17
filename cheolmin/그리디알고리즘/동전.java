package edu.charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;
		
		int[] coin = new int[N];
		
		for(int i = N-1;i >= 0 ;i--) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i < N;i++ ) {
			count += K/coin[i];
			K %= coin[i];
		}
		System.out.println(count);

	}

}
