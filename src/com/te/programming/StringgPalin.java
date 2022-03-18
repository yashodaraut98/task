package com.te.programming;

public class StringgPalin {
	
	public static void main(String[] args) {
		String sentence= "radar";
		char[] charArray = sentence.toCharArray();
		String rev="";
		for (int i = charArray.length-1; i >=0 ; i--) {
			rev=rev+sentence.charAt(i);
		}
		if(rev.equals(sentence)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}