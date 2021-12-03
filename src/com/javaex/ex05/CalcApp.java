package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
    		String numLine = sc.nextLine();

    		if (numLine.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		} else {
    		//공백을 기준으로 문자열을 나누어 배열에 저장한다
    		String[] numArray = (numLine.trim()).split(" ");
    		
    		//나눠진 문자열 a, b를 int형으로 바꾸어 int 변수에 대입한다
    		int a = Integer.parseInt(numArray[0]);
    		int b = Integer.parseInt(numArray[2]);
    		
    		//연산자 문자열은 op에 대입한다
    		String op = numArray[1];
    		
    		//switch-case문을 이용해 op값에 따라 연산이 달라지도록 한다.
    		switch(op) {
    			case "+":
    				Add add = new Add(); //객체 생성
            		add.setValue(a, b);  //객체에 a, b 값 set
            		System.out.println(">> " + add.calculate()); //caculate() 결과 출력
            		break;
    			case "-":
    				Sub sub = new Sub();
    				sub.setValue(a, b);
    				System.out.println(">> " + sub.calculate());
    				break;
    			case "*":
    				Mul mul = new Mul();
    				mul.setValue(a, b);
    				System.out.println(">> " + mul.calculate());
    				break;
    			case "/":
    				Div div = new Div();
    				div.setValue(a, b);
    				System.out.println(">> " + div.calculate());
    				break;
    			default: //위의 경우에 해당하지 않는 케이스 처리
    				System.out.println("알 수 없는 연산입니다.");
    			}
    		}
    	}
    	
    	sc.close();
    	
    }
}
