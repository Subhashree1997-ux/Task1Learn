package org.task;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		int sum=0,r;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}
	
	

}
