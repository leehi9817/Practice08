package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		//주소값 비교
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true
		
		//equals 메소드가 Point 클래스에 없어도 실행되는 이유
		//Point의 부모 메소드인 Object에 equals 메소드가 있기 때문이다
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true
	}

}


