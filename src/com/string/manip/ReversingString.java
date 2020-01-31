package com.string.manip;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingString {

	public static void main(String[] args) {
		String word = "Wait this is a new word";
		System.out.print("Given Word: "+word);
		System.out.print("\nReversed word: ");
		getReversedString(word);
		reverseUsingStack(word);
		reverseUsingQueue(word);
		System.out.println("+++++++++++++++++++++++++++++++");
		String newWord = "Gillete";
		System.out.println(newWord);
		StringBuilder sb = new StringBuilder(newWord);
		System.out.println(sb.reverse());
		StringBuilder sbuff = new StringBuilder("String Buffer");
		System.out.println(sbuff.reverse());
	

	}

	private static void getReversedString(String word) {
		String reversed = "";
		int len = word.length();
		System.out.println("Length of word is: "+len);
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		System.out.println("Reversed Word using for loop: "+reversed);
	}
	public static void reverseUsingStack(String word) {
		Stack<Character> st = new Stack<>();
		String reversed = "";
		for (int i = 0; i < word.length(); i++) {
			st.add(word.charAt(i));
		}
		
		while(!st.isEmpty()) {
			reversed +=st.pop();
		}
		
		System.out.println("Reversed Word using stack is: "+reversed);
	}
	public static void reverseUsingQueue(String word) {
		Queue<Character> queue = new LinkedList<>();
		String reversed = "";
		for (int i = word.length()-1; i>=0; i--) {
			queue.add(word.charAt(i));
		}
		
		while(!queue.isEmpty()) {
			reversed +=queue.remove();
		}
		
		System.out.println("Reversed Word using queue is: "+reversed);
	}

}
