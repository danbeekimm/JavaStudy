package study;


//�ϳ��� �ҽ����Ͽ��� �ϳ��� Ŭ������ �ۼ��ϴ� ���� �ٶ����ϴ�.
class Classes {
	public static void main(String args[]) {
		Tv t1;
		t1=new Tv();
		Tv t2=new Tv();
		t1.channel =7;
		t1.channelDown();
		
		t2=t1; //t1 ���� t2�� ����
		System.out.println("����ä����"+t1.channel+"�̴�");
		System.out.println(t2.channel);
	}
}	
class Tv{
	//�������
	String colorString;
	boolean power;
	int channel;
	
	//�޼���
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

