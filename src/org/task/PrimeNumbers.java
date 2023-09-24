package org.task;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				break;
			}
			
		}
		System.out.println(n+ " is a prime Number");
	}

}
