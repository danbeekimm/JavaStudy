package study;

class MyPoint extends Object{
	int x;
	int y;
}

//���
//class Circle extends MyPoint{
//	int r;
//}



//����
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
		//object�� tostring�� ��������.�׷��������ȳ�
		//�Ѵ� ����������
		//study.Circle@5aaa6d82
		//study.Circle@5aaa6d82
	}

}
