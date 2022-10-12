package com.simplilearn.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticBlock {
	
	static int B;
	static int H;
	
	static void area() throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		double B= Double.parseDouble(br.readLine());
		double H= Double.parseDouble(br.readLine());
		
		if((B>0)&&(H>0)) {
			double area=B*H;
			System.out.println("Area of Parallogram: "+area);
		}
		else {
			System.out.println("java.lang.exception:Breadth and Length must be positive");
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		StaticBlock.area();
	}

}
