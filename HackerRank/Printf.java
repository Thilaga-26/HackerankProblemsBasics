package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printf {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1;i<=3;i++) {
			String s= br.readLine();
			int n= Integer.parseInt(br.readLine());
			System.out.printf("%-15s%03d%n", s, n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
