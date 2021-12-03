package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		
		//obj의 시선이 Object에 있어 Point의 인자에 접근할 수 없다
		//다운캐스팅을 하여 x, y에 접근하도록 한다
		Point p = (Point)obj;
		
		//x값을 비교하여 서로 같으면 true를 리턴한다
		if (this.x == p.x) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
