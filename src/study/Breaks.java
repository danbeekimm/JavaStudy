package study;

public class Breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop:for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j==5) {
					break Loop;
				}
			}
		}
	}

}
