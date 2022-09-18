package study;

class Tv {
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

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
		sTv.displayCaption("hi"); //꺼져있을때 입력
		sTv.caption=true; //키면?
		sTv.displayCaption("hello"); //이상태 출력
	}
}
