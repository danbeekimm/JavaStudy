package study;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {12,58,97,54,86,25};
		
		int max=score[0];
		int min = score[0]; //max�� min�� 1��°������ �ʱ�ȭ
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max = score[i];
			}else if (min >score[i]) {
				min = score[i];
			}
		}
		System.out.println("�ִ�=" + max);
		System.out.println("�ּ�=" + min);
	}

}
