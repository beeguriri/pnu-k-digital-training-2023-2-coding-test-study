package edu.charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] R = new long [n-1];
		long[] C = new long [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n-1;i++) {
			R[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n;i++) {
			C[i] = Integer.parseInt(st.nextToken());
		}
		
		long s =0;
		for(int i=0; i< R.length;i++) {
			if(C[i] < C[i+1]) C[i+1] = C[i];
			
			s += R[i] * C[i];
		}
		
		System.out.println(s);
	}
	

}
