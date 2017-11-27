package test.mypac;

public class Pen {
	//맴버필드
	public String color;
	//생성자
	public Pen(String color) {
		this.color=color;
	//this-> 힙 영역에서 자기 자신의 참조값을 가리키는 예약어
	//동일한 지역변수 color 가 있으므로 this. 생략 못함 
	}
	//맴버 메소드
	public Pen write() {
		System.out.println(this.color+" 색 Pen 으로 필기를 해요");
		return this;
		
	}
	public Pen draw() {
		System.out.println(color+" 색 Pen 으로 그림을 그려요");
		return this;
	}
	
}
