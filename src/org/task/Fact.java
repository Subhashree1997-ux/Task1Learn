package org.task;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		int fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of " +n+ " is:"+fact);
	}

}
