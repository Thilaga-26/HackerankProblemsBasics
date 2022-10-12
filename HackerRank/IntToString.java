package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntToString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		try {
		String s= Integer.toString(n);
		String s1= n+"";
		
		System.out.println("Integer: "+n);
		System.out.println("String: "+s);
		System.out.println("String: "+s1);
		
		if(n==Integer.parseInt(s)) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("Wrong Answer");
		}
		}
		catch(Exception e) {
			System.out.println("Catched Exception");
		}
	}
}
