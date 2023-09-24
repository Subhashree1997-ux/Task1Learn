package org.task;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int r;
		System.out.println("Enter the number to be reversed:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		
	}

}
