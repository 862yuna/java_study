package com.gn.study.constructor.model.vo;

public class Test {
	public void test(int i) {} // 기준점 / 위에서 아래로 출력기준
	// 1번, 2번, 5번, 7번 정답. 오버로딩 성립 가능
	public void test(String str) {} // 1번
	
	public void test (int i, String str){} //2번
	
//	public void test(int num){} // 3번
	
//	public char test(int point){} // 4번

	public void test(int i,int k) {} // 5번
	
//	public void test(int num, String string){} //6번
	
	public void test(String str, int i){} // 7번

}
