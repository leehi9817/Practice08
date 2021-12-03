package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		//공백을 기준으로 나누어서 배열에 넣기
		String[] numArray = numLine.split(" ");
		
		//배열에 담긴 문자열을 int로 변환
		//변환된 int 값들을 더해서 sum에 대입
		for(int i=0; i<numArray.length; i++) {
			sum += Integer.parseInt(numArray[i]);
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
