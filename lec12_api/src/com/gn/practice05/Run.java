package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
	String[] words = {"java", "application", "programming", "interface"};
	String sentence = String.join(" ", words);
	System.out.println("문장 : "+sentence);
	String result = "";
	// 선생님 풀이방식
	for(int i =1;i<words.length;i++) {
		result += words[i].substring(0,1).toUpperCase();
	}
	System.out.println(result);
	
//	System.out.println(words[0]);
	String text = words[1].substring(0,1).toUpperCase();
//	System.out.println(text1);
	
	String text2 = words[2].substring(0,1).toUpperCase();
//	System.out.println(text2);
	
	String text3 = words[3].substring(0,1).toUpperCase();
//	System.out.println(text3);
	text = text.concat(text2);
//	System.out.println(text);
	text = text.concat(text3);
	System.out.println("변환 : "+text);
	
	
	
	}

}
