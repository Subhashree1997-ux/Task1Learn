package org.task;

import java.util.Scanner;

public class CountOfNumber {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	

}
