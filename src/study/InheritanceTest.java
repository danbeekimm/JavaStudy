package study;

class MyPoint extends Object{
	int x;
	int y;
}

//상속
//class Circle extends MyPoint{
//	int r;
//}



//포함
class Circle extends Object{
	MyPoint  p = new MyPoint();
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x =1;
		c.p.y=2;
		c.r=3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
		System.out.println(c.toString());
		System.out.println(c);
		//object가 tostring을 갖고있음.그래서에러안남
		//둘다 같은값나옴
		//study.Circle@5aaa6d82
		//study.Circle@5aaa6d82
	}

}
