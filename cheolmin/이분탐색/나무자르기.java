package edu._2jin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int leagh = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long [] a = new long [count];
		for(int i = 0; i< count;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		long high = a[count-1];
		long low = 0;
		long mid = 0;
		long result = 0;
		while(low <= high) {
			long total = 0;
			mid = (low+high)/2;
			
			for(int i =0; i<count; i++) {
				if(a[i]>mid) total += a[i]-mid; 
			}
			if(total< leagh) {
				high = mid-1;
			}
			else {
				result = mid;
				low = mid +1;
				
			}
		}
		System.out.println(result);
		
	}

}
