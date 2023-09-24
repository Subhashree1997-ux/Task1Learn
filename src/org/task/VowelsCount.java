package org.task;

public class VowelsCount {
	public static void main(String[] args) {
		int vowel=0;
		String s="Java123 Application!@#";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A') {
						vowel++;
					}
		}
		System.out.println("The Count of Vowel is:"+vowel);
	}

}
