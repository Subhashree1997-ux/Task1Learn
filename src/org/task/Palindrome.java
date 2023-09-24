package org.task;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int s=0,r,c;
		System.out.println("Enter the number to check whether it is palindrome or not");
		Scanner e=new Scanner(System.in);
		int n=e.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("The given Number is Palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
		
		
	}

}
