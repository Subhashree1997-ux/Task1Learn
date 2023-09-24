package org.task;

import java.util.Scanner;

public class CompareTo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str = s.next();
		System.out.println("Enter the String2:");
		String str1=s.next();
		int compareTo = str.compareTo(str1);
        System.out.println(compareTo);
	}
	
	

}
