package study;

import java.util.Scanner;

public class Ex5_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] wordStrings = {
				{"chair","����"}, //[0][0], [0][1]
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < wordStrings.length; i++) {
			System.out.printf("Q%d. %s�� ����?%n",i+1,wordStrings[i][0]);
			//%s : ���ڿ���� %d : �������
			String tmp = scanner.nextLine();
			
			if (tmp.equals(wordStrings[i][1])) {
				System.out.println("���� %n%n");
			}else {
				System.out.printf("Ʋ��. ������ %s �Դϴ�%n",wordStrings[i][1]);
			}
		}
		
	}

}
