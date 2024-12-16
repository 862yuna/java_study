package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
	// 1. 리터럴 -> ""
	// 값이 같으면 hashCode 동일, == 비교 연산자 사용 가능	
	String str = "Hello";
// 	String str = new String("Hello");	
	System.out.println("Hello(1) : "+System.identityHashCode(str)); // 오버라이드 할 수 없는 메소드
//	str += "World";
	System.out.println(System.identityHashCode(str));	
	System.out.println("______________________________");	
	// String 은 변하지 않는 불변객체	
	String str1 = "Hello";
	System.out.println("Hello(2) : "+System.identityHashCode(str1));
	if(str==str1) {
		System.out.println("같다!!");
	}
	System.out.println("______________________________");
	// 2. new 연산자 -> 객체 -> 비교연산자 사용X, equals 사용해서 비교.
	String str2 = new String("Hello");
	System.out.println(System.identityHashCode(str2));
	
	System.out.println("______________________________");
	
	// 3. equals
	System.out.println("equals() : "+("Hi".equals(str2)));
	// 4. length()
	System.out.println("length() : "+str2.length());
	// 5. charAt()
	System.out.println("charAt() : "+str2.charAt(0));
	// 6. toCharArray()
	char[] arr = str2.toCharArray();
	// 7. contains()
	System.out.println("contains() : "+str2.contains("lo"));
	// 8. compareTo() => Hello
	System.out.println("compareTo() : "+str2.compareTo("ZZZ"));
	// 9. concat -> 원본값 수정 불가능
	String test = "우리는";
	test = test.concat(" 할수있다.");
	System.out.println(test);
	System.out.println("______________________________");
	// 10. indexOf
	test = "2024.12.16.12.43";
	System.out.println(test.indexOf("."));
	System.out.println(test.indexOf("12")); // 5, 6번이 5
	System.out.println(test.lastIndexOf("12"));
	System.out.println("______________________________");
	// 11. split() -> 문자열.split(구분자);
	String[] time = test.split(".");
	for(String t : time) {
		System.out.println(t);
	}
	String name = "김-철-수";
	String[] nameArr = name.split("-");
	for(String n : nameArr) {
		System.out.print(n);
	}
	System.out.println();
	
	String a = "a+b+c+d";
	String[] arrA = a.split("\\+");
	String b = "e.f.g.h";
	String[] arrB = b.split("\\.");
	for(String a1 : arrA) {
		System.out.print(a1);
	}
	System.out.println();
	for(String b1 : arrB) {
		System.out.print(b1);
	}
	System.out.println();
	System.out.println("______________________________");
	// 문자열 바꾸기
	String ide = "eclipse";
	ide = ide.replace("e", "a");
	System.out.println(ide);
	String id = "김 철 수";
	id = id.replace(" ", "");
	System.out.println(id);
	// 비어있는지 확인
	System.out.println("_____________isBlank()_______________");
	String empty1 = ""; // 값이 없는 경우
	String empty2 = " "; // 띄어쓰기가 있는 경우
	System.out.println("(1) : "+empty1.isBlank()); // true
	System.out.println("(2) : "+empty2.isBlank()); // true
	System.out.println("____________isEmpty()_______________");
	System.out.println("(3) : "+empty1.isEmpty());
	System.out.println("(4) : "+empty2.isEmpty());
	System.out.println("____________test.length()_______________");
	System.out.println(empty1.length()==0);
	empty2=empty2.replace(" ", ""); // 공백 없애면 true/ 아니면 false
	System.out.println(empty2.length()==0);
	System.out.println("____________trim()_______________");
	String empty3 = " 안 녕 ";
	empty3 = empty3.trim(); // 앞 뒤 공백만 없애줌.
	System.out.println(empty3); //안 녕
	System.out.println("____________join()_______________"); // 쪼개진걸 합치기
	String[] students = {"성재","주연","승철"};
	String allStudent = String.join("-",students);
	System.out.println(allStudent);
	System.out.println("____________substring()_______________");
	String cutTest = "hello world";
	System.out.println(cutTest.substring(6)); // world
	System.out.println(cutTest.substring(0,5)); // hello
	// cutTest.charAt(3)
	System.out.println(cutTest.substring(3,4)); // l
	
	String file = "test.jpg";
	String ex = file.substring(file.lastIndexOf(".")+1);
	String file_name = file.substring(0,file.lastIndexOf("."));
	System.out.println(ex+" : "+file_name);
	
	
	
	}
}
