package study;


class MyPoint4 extends Object{
	int x;
	int y;
	//생성자있으면 p.x=3; p.y=5; 생략가능
	MyPoint4(int x,int y){
		this.x=x;
		this.y=y;
	}
	//object클래스의 tostring()을 오버라이딩
	//public 은 object클래스의 tostring()에붙어있어서 유지
	public String toString() {
		return "x:"+x+"y:"+y;
		}
}


public class OverrideTest2 {

	public static void main(String[] args) {
		MyPoint4 p = new MyPoint4(3,5);
//		p.x=3;
//		p.y=5;
		//밑에 두개는 출력하면 같은결과가 나옴
		System.out.println(p.toString());
		System.out.println(p);
	}

}
