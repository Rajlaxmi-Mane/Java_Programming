package com.accelya;

public class StringProg {
	public static void main(String[] args) {
		String str="this is very very long sent";
		
		String[] word = str.split(" ");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		System.out.println(word.length);
		int cnt=0;
		int cou=0;
		int i=0;
		for(int j=i+1;j<word.length;j++) {
			if(word[i].equals(word[j])) {
				cnt++;
			}else {
				cou++;
			}
			i++;
		}
		System.out.println(cou);
		String str2=str.toUpperCase();
		int cnt2=0;
		for(int k=0;k<str2.length();k++) {
			char ch=str2.charAt(k);
			if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
				cnt2++;
			}
		}
		System.out.println(cnt2);
	}
	
}

