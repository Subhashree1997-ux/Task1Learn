package org.task;

public class Fibonacci {
public static void main(String[] args) {
	int n=100;
	int f=1,s=1,t;
	System.out.print(f+",");
	System.out.print(s+",");
	for(int i=3;i<=100;i++) {
		t=f+s;
		if(t>=100) {
			break;
		}
		System.out.print(t+",");
		f=s;
		s=t;
		}
}
}
