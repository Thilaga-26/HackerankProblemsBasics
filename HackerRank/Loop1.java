package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" x "+N+" = "+N*i);
		}
	}

}
