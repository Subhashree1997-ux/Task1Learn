package org.task;

public class Even {
	private void printRow() {
		int n=8;
		int column=2;
		for(int i=0;i<4;i++) {
			for(int j=column;j<=n;j=j+2) {
				System.out.print(j+" ");
			}
//			System.out.println(); 
//			n=n+8;
//			column=column+8;
			}
	} 
	public static void main(String[] args) {
		Even e=new Even();
		e.printRow();
		
	}

}
