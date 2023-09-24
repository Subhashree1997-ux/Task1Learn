package org.task;

public class Print {
	private void one() {
		int n=1;
	    for(int i=1;i<=4;i++) {
	    	for(int j=1;j<=n;j++) {
	    		System.out.print(1);
	    	}
	    	System.out.println();
	    	n++;
		
	}

}
	public static void main(String[] args) {
		Print p=new Print();
		p.one();
	}
}
