package com.simplilearn.HackerRank;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);	  
	
		for(int i=1;sc.hasNext();i++) {
			System.out.println(i+"  "+sc.nextLine()); 
		 }
	
	}
}
