package study;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDE";
		char ch = str.charAt(0);
		String str2 = str.substring(1,4);
		//to�»����̹Ƿ� ���������ڻ���
		
		String str3 = str.substring(1);
		//to �����������Ƿ� �ε��� 1���� ~ ���
		
		String str4 = str.substring(1, str.length());
		
		
		System.out.println(ch); //A ��ȯ
		System.out.println(str2); 
		System.out.println(str3); 
		System.out.println(str4); 
		
		
	}

}
