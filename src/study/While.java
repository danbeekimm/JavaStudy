package study;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =0, answer=0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1~100사이 정수");
			input = sc.nextInt();
			
			if (input>answer) {
				System.out.println("더작은수 입력하세요");
			}else if (input<answer) {
				System.out.println("더큰수 입력하세요");
			}
		} while (input!=answer);
		System.out.println("정답");
	}

}
