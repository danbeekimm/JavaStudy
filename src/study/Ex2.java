package study;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		int y = 6;
		
		System.out.printf("%d을 %d로 나누면, %n",x,y);
		System.out.printf("몫은 %d 이고 나머지는 %d 이다%n",x/y,x%y);
		System.out.println(10%8);
		System.out.println(10%-8);
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
