package edu.charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 회의실배정 {
	static class Meeting implements Comparable<Meeting>{
		int start,end;
		Meeting(int a, int b){
			start = a;
			end = b;
		}
		public int compareTo(Meeting m){
            if(end == m.end){
                return start - m.start;
            } else {
                return end - m.end;
            }
        }
			
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Meeting> meetings = new ArrayList<>();
		
		for(int i = 0;i < N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a1 =Integer.parseInt(st.nextToken());
			int a2 =Integer.parseInt(st.nextToken());
			
			meetings.add(new Meeting(a1,a2));
		}
		Collections.sort(meetings);
		
		int endTime = -1;
		int count = 0;
		for(int i = 0; i < N; i++) {
			int start = meetings.get(i).start;
			int end = meetings.get(i).end;
			if(start >= endTime) {
				endTime = end;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
