package study;

public class ExFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int j = 1; j <=10; j++) {
//
//			for (int i = 10; i >= j; i--) {
//				System.out.print("*");
//			}	
//			System.out.println();
//		}
		
		int i=0;
		int j = 0;
		while (j<=10) { //j =0.1.2.3.4.5.6.7.8.9.10
			i=0;
			while (i<=j) { //j=0.1.2.3.4.5.6.7.8.9.10
				if (j>i) {
					System.out.printf("*");
				}else {
					System.out.printf("");
				}
				i++;
			}
			System.out.println("\n");
			j++;
		}
	}
	
}
