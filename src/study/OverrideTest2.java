package study;


class MyPoint4 extends Object{
	int x;
	int y;
	//������������ p.x=3; p.y=5; ��������
	MyPoint4(int x,int y){
		this.x=x;
		this.y=y;
	}
	//objectŬ������ tostring()�� �������̵�
	//public �� objectŬ������ tostring()���پ��־ ����
	public String toString() {
		return "x:"+x+"y:"+y;
		}
}


public class OverrideTest2 {

	public static void main(String[] args) {
		MyPoint4 p = new MyPoint4(3,5);
//		p.x=3;
//		p.y=5;
		//�ؿ� �ΰ��� ����ϸ� ��������� ����
		System.out.println(p.toString());
		System.out.println(p);
	}

}
