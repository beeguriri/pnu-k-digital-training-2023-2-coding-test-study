package edu.charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 보물 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int N =Integer.parseInt(br.readLine());
		Integer[] A = new Integer [N];
		Integer[] B = new Integer [N];
		int S = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		
		for(int i = 0; i < N;i++) {
			S += A[i]*B[i];
		}
		System.out.println(S);
		
	}

}
