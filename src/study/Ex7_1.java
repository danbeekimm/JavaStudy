package study;

class Tv {
	boolean power; // ��������(on/off)
	int channel;	// ä��

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

class SmartTv extends Tv{
	boolean caption;
	void displayCaption (String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class Ex7_1{
	public static void main(String args[]) {
		SmartTv sTv = new SmartTv();
		sTv.channel=10;
		sTv.channelUp();
		System.out.println(sTv.channel);
		sTv.displayCaption("hi"); //���������� �Է�
		sTv.caption=true; //Ű��?
		sTv.displayCaption("hello"); //�̻��� ���
	}
}
