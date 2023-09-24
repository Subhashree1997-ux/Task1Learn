package org.task;
public class AdditionOfOdd{
	
	private void add() {
		int oddsum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				oddsum=oddsum+i;
				}
			}
		System.out.println(oddsum);
	}
	public static void main(String[] args) {
		AdditionOfOdd s=new AdditionOfOdd();
		s.add();
	}
}
