package com.simplilearn.HackerRank;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

		for(int i=1;i<=t;i++) {
			try {
			
			long n= sc.nextLong();
			System.out.println(n+ " can be fitted");
			
			if((n>=-Math.pow(2, 8-1))&&(n<=Math.pow(2, 8)-1)) {
				System.out.println("Byte");
			}
			if((n>=-Math.pow(2, 16-1))&&(n<=Math.pow(2, 16)-1)) {
			    System.out.println("Short");
		    }
		    if((n>=-Math.pow(2, 32-1))&&(n<=Math.pow(2, 32)-1)) {
	            System.out.println("Integer");
		    }
		    if((n>=-Math.pow(2, 64-1))&&(n<=Math.pow(2, 64)-1)) {
	            System.out.println("Long");
		    }
			}
			catch(Exception e) {
				System.out.println(sc.next()+" cannot be fitted");
			}
            }
  
	}

}
