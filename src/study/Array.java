package study;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		score[3]=100;
		
		System.out.println("score[0]"+score[0]);
		System.out.println("score[1]"+score[1]);
		System.out.println("score[2]"+score[2]);
		System.out.println("score[3]"+score[3]);
		System.out.println("score[4]"+score[4]);
		
	
		for (int i = 0; i <score.length; i++) {
			System.out.println("score["+i+"]="+ score[i]);
		}
		int[] Arr={100,95,80,70,60};
		System.out.println(Arrays.toString(Arr));
		
	}

}
