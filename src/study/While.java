package study;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =0, answer=0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1~100���� ����");
			input = sc.nextInt();
			
			if (input>answer) {
				System.out.println("�������� �Է��ϼ���");
			}else if (input<answer) {
				System.out.println("��ū�� �Է��ϼ���");
			}
		} while (input!=answer);
		System.out.println("����");
	}

}
