package org.task;

public class StartPattern {
	public static void main(String[] args) {
		System.out.println("Printing Star Pattern");
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//				for(int j=4;j>i;j--){
//					System.out.print("  *");
//			}
//		System.out.println();
//	}
		int sum=0,count=0;
		double average;
		for(int i=10;i<=30;i++) {
			if(i%2!=0) {
				System.out.println(i);
				count++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
		average=sum/count;
		System.out.println(average);

}
}
