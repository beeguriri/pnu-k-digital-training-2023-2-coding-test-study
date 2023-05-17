package edu._2jin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
	
	static int binarySearch(int key,int low,int high, int []arr) {
		int mid;
		while(low <= high){
			mid = (low + high)/2;
			
			if (key == arr[mid]) {
				return 1;
			}else if (key < arr[mid]) {
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
			
		return 0;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		
		int [] b = new int [m];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < m;i++) {
			  
			  System.out.println(binarySearch(b[i],0,n-1, a));
			}
	}

}
