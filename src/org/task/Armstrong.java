package org.task;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int rem,arm=0,c;
		System.out.println("Enter the number to check whether armstrong no or not:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("The given no is amstrong");	
		}
		else {
			System.out.println("The given no is not amstrong");
		}
		
		
		
	}
	

}
