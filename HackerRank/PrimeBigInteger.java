package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeBigInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		
		 boolean flag= true;
	        
	        int sqrt=(int) Math.sqrt(n)+1;  
	        for(int i=2;i<sqrt;i++){ 
	            if(n%i==1){
	                flag=true;
	            }
	        }
	        if(flag==true){
	            System.out.println("prime");
	        }
	        else{
	            System.out.println("not prime");
	        }
		
            
	}
}
