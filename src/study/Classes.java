package study;


//하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직하다.
class Classes {
	public static void main(String args[]) {
		Tv t1;
		t1=new Tv();
		Tv t2=new Tv();
		t1.channel =7;
		t1.channelDown();
		
		t2=t1; //t1 값을 t2에 저장
		System.out.println("현재채널은"+t1.channel+"이다");
		System.out.println(t2.channel);
	}
}	
class Tv{
	//멤버변수
	String colorString;
	boolean power;
	int channel;
	
	//메서드
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

