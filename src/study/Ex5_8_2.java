package study;

import java.util.Scanner;

public class Ex5_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] wordStrings = {
				{"chair","의자"}, //[0][0], [0][1]
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < wordStrings.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?%n",i+1,wordStrings[i][0]);
			//%s : 문자열출력 %d : 숫자출력
			String tmp = scanner.nextLine();
			
			if (tmp.equals(wordStrings[i][1])) {
				System.out.println("정답 %n%n");
			}else {
				System.out.printf("틀림. 정답은 %s 입니다%n",wordStrings[i][1]);
			}
		}
		
	}

}
