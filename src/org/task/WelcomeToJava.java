package org.task;

public class WelcomeToJava {
	public static void main(String[] args) {
		int upper=0,lower=0;
		String Str1="WelComeToJava";
		for(int i=0;i<Str1.length();i++) {
			char ch=Str1.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upper++;
			}
			else if(ch>='a'&&ch<='z') {
				lower++;
			}
			else {
				System.out.println("");
			}
		}
		System.out.println("The Count of Uppercase:"+upper);
		System.out.println("The Count of Lowercase:"+lower);
	}
	

}
