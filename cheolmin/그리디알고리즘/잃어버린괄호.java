package edu.charpter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 잃어버린괄호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] arr= s.split("\\-");
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			String[] arr2 = arr[i].split("\\+");
			for(int j=0; j<arr2.length;j++) {
				if(i==0) sum += Integer.parseInt(arr2[j]);
				else sum -= Integer.parseInt(arr2[j]);
			}
		}
		System.out.println(sum);

	}

}
