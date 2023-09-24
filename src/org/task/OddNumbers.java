package org.task;

public class OddNumbers {
	private void odd() { 
		for(int i=100;i>=1;i--) {
			if(i%2!=0) {
		 System.out.println(i);
			}
	}
		}
		public static void main(String[] args) {
			OddNumbers e=new OddNumbers();
			e.odd();
		}

}
