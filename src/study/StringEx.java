package study;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDE";
		char ch = str.charAt(0);
		String str2 = str.substring(1,4);
		//to는생략이므로 마지막숫자생략
		
		String str3 = str.substring(1);
		//to 지정안했으므로 인덱스 1부터 ~ 출력
		
		String str4 = str.substring(1, str.length());
		
		
		System.out.println(ch); //A 반환
		System.out.println(str2); 
		System.out.println(str3); 
		System.out.println(str4); 
		
		
	}

}
