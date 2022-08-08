package study;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(score));
		
		for (int i = 0; i < 100; i++) {//100번두요소 값 바꾸기
			int n = (int)(Math.random()*10);
			int t = score[0];
			score[0] = score[n];
			score[n] = t; //score[0]과 score[n]을 서로바꾼다.
		}
		System.out.println(Arrays.toString(score));
	}

}
