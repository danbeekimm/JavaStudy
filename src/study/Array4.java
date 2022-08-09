package study;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] loto = new int[45]; //45개 정수저장 , index:0~44
		
		for (int i = 0; i < loto.length; i++) {
			loto[i] = i+1; //1~45
			
		}System.out.println(Arrays.toString(loto));
		
		int tmp =0; //값 변경을위한 변수
		int j = 0; //임의의 값얻어 저장할 변수
		
		for (int i = 0; i < 6; i++) { //6개만 바꾸기
			j=(int)(Math.random()*45);//임의요소에 저장된값과 i를바꾸기
			//0~44범위의 index 값 얻기위해
			
			tmp = loto[i];
			loto[i]=loto[j];
			loto[j]=tmp;
			System.out.println(Arrays.toString(loto));
		}
		//배열 앞에서 부터 6개 요소를 출력한다
		for (int i = 0; i < 6; i++) {
			System.out.printf("loto[%d]=%d%n",i,loto[i]);
		}
	}
}
