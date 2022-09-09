package study;


class IvLvCv {
	public static void main(String args[]) {
		//cv는 객체생성 없이 사용
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
	
	Card c1 = new Card();
	//c1은 참조변수
	c1.kind = "Heart";
	c1.number = 7;
	
	Card c2 = new Card();
	c2.kind = "Spade";
	c2.number = 4;
	
	System.out.println("c1은"+c1.kind+","+c1.number+
			"이며,크기는 ("+c1.width+","+c1.height+")");
	System.out.println("c2은"+c2.kind+","+c2.number+
			"이며,크기는 ("+c2.width+","+c2.height+")");
	
	//변경 이거 cv임. c1과 c2가 바뀜/ 모든객체가 공유하기 때문에
	Card.width = 50;
	Card.height = 80;
	
	System.out.println("c1은"+c1.kind+","+c1.number+
			"이며,크기는 ("+c1.width+","+c1.height+")");
	System.out.println("c2은"+c2.kind+","+c2.number+
			"이며,크기는 ("+c2.width+","+c2.height+")");
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}