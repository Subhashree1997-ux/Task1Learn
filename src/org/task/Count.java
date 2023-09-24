package org.task;

public class Count {
public static void main(String[] args) {
	int upper=0,lower=0,specialch=0,number=0;
	String s="Java123 Application!@#";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z') {
			upper++;
		}
		else if(ch>='a'&&ch<='z'){
			lower++;
		}
		else if(ch>='0'&&ch<='9') {
			number++;
			}
		else {
			specialch++;
		}
	}
	System.out.println("The count of UpperCase Letter is:"+upper);
	System.out.println("The count of LowerCase Letter is:"+lower);
	System.out.println("The count of Number Letter is:"+number);
	System.out.println("The count of SpecialCharacter Letter is:"+specialch);
}
}
 