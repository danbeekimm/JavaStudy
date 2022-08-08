package study;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rd = {"가위","바위","보"};
		System.out.println(Arrays.toString(rd));
		
		for (int i = 0; i < 5; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(rd[tmp]);
		}
	}

}
