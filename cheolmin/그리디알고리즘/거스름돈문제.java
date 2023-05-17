package edu.greedy;

public class 거스름돈문제 {
	public static void main(String[] args) {
		int n = 1260;
		int count = 0;
		int[] coinTypes = {500, 100, 50, 10};
		
		for(int i = 0; i < 4;i++) {
			count +=n/coinTypes[i];
			n %= coinTypes[i];
		}
		System.out.println(count);
	}
}
