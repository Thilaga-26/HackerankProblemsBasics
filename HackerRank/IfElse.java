package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		
		if(n%2==1) {
			System.out.println("Weird");
		}
		else if((n>2)&&(n<5)) {
			System.out.println("Not Weird");
		}
		else if((n>6)&&(n<20)) {
			System.out.println("Weird");
		}
		else if(n>20){
			System.out.println("Not Weird");
		}
	}

}
