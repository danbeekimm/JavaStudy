package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hasolution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int num = string.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (Palindrome(string.substring(i))) {
				
			}
		}
	
	}

	private static boolean Palindrome(String string) {
		// TODO Auto-generated method stub
		int startnum=0;
		int endnum = string.length()-1;
		while(startnum <= endnum) {
			if (string.charAt(startnum) != string.charAt(endnum)) 
				return false;
				startnum++;
				endnum--;
			
		}
		return true;
	}

}
