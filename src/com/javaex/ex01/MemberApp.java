package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setName("정우성");
		m1.setId("jws");
		m1.setPoint(50000);
		
		Member m2 = new Member();
		m2.setName("유재석");
		m2.setId("yjs");
		m2.setPoint(30000);
		
		Member m3 = new Member();
		m3.setName("이효리");
		m3.setId("lhr");
		m3.setPoint(40000);
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		
	}

}