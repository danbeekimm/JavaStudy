package study;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] loto = new int[45]; //45�� �������� , index:0~44
		
		for (int i = 0; i < loto.length; i++) {
			loto[i] = i+1; //1~45
			
		}System.out.println(Arrays.toString(loto));
		
		int tmp =0; //�� ���������� ����
		int j = 0; //������ ����� ������ ����
		
		for (int i = 0; i < 6; i++) { //6���� �ٲٱ�
			j=(int)(Math.random()*45);//���ǿ�ҿ� ����Ȱ��� i���ٲٱ�
			//0~44������ index �� �������
			
			tmp = loto[i];
			loto[i]=loto[j];
			loto[j]=tmp;
			System.out.println(Arrays.toString(loto));
		}
		//�迭 �տ��� ���� 6�� ��Ҹ� ����Ѵ�
		for (int i = 0; i < 6; i++) {
			System.out.printf("loto[%d]=%d%n",i,loto[i]);
		}
	}
}
