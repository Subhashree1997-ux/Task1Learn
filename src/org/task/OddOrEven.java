package org.task;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find whether it is odd or even");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("The Number entered is even");
		}
		else {
			System.out.println("The number entered is odd");
		}
		
	}

}
