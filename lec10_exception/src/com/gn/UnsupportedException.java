package com.gn;

public class UnsupportedException extends Exception{
	public UnsupportedException() {
		super("원인을 알 수 없는 오류가 발생했습니다.");
	}
}
