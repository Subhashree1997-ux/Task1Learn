package org.task;

public class PrintReverse {
	public void reverse() {
		int row=4;
	    for(int i=1;i<=4;i++) {
	    	for(int j=1;j<=row;j++) {
	    		System.out.print(1);
	    	}
	    	System.out.println();
	    	row--;
		
	}
	}
	public static void main(String[] args) {
		PrintReverse p=new PrintReverse();
		p.reverse();
	}
}


