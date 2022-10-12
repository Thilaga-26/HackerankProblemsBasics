package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinOut2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
	    double d= Double.parseDouble(br.readLine());
	    String s= br.readLine();
	    
	    System.out.println("String: "+s);
	    System.out.println("Double: "+d);
	    System.out.println("Integer: "+n);
	}

}
