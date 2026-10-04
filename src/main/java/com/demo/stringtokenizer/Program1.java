package com.demo.stringtokenizer;

import java.util.StringTokenizer;

public class Program1 {
	public static void main(String[] args) {
		String s="java programming course";
		StringTokenizer st=new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
