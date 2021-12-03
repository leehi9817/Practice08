package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		//객체 정보를 저장할 배열 만들기
		Friend[] fArray = new Friend[3];
		
		//모든 과정 3번 반복
		for (int i=0; i<3; i++) {
		
			//정보 입력 받기
			String sLine = sc.nextLine();
			
			//공백을 기준으로 문자열 나누어 배열에 넣기
			//split 메소드는 string 요소가 아니라 배열 자체를 return해준다
			String[] sArray = sLine.split(" ");
			
			//배열에 저장된 값을 이용하여 객체 생성
			String name = sArray[0];
			String phone = sArray[1];
			String school = sArray[2];
			
			//객체 배열에 생성된 객체 저장
			fArray[i] = new Friend(name, phone, school);
			
		}	
		
		//배열을 돌며 객체 정보 출력
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showInfo();
		}
		
		sc.close();

	}

}
