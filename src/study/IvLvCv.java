package study;


class IvLvCv {
	public static void main(String args[]) {
		//cv�� ��ü���� ���� ���
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
	
	Card c1 = new Card();
	//c1�� ��������
	c1.kind = "Heart";
	c1.number = 7;
	
	Card c2 = new Card();
	c2.kind = "Spade";
	c2.number = 4;
	
	System.out.println("c1��"+c1.kind+","+c1.number+
			"�̸�,ũ��� ("+c1.width+","+c1.height+")");
	System.out.println("c2��"+c2.kind+","+c2.number+
			"�̸�,ũ��� ("+c2.width+","+c2.height+")");
	
	//���� �̰� cv��. c1�� c2�� �ٲ�/ ��簴ü�� �����ϱ� ������
	Card.width = 50;
	Card.height = 80;
	
	System.out.println("c1��"+c1.kind+","+c1.number+
			"�̸�,ũ��� ("+c1.width+","+c1.height+")");
	System.out.println("c2��"+c2.kind+","+c2.number+
			"�̸�,ũ��� ("+c2.width+","+c2.height+")");
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}