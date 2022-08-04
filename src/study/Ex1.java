package study;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3";
		System.out.println(s.charAt(0)-'0');//문자'3'으로 변경후 '0'을 빼면서 숫자로변경
		System.out.println('3'-'0'+1);//'0'문자 0을 빼 숫자로 변경 후 +1 더해줌 >숫자4
		System.out.println(Integer.parseInt("3")+1);//숫자3으로 변경후+1 >숫자4
		System.out.println("3"+1);//문자열"3"에 숫자1더함으로써 문자 31이 됨
		System.out.println(3+'0');//숫자에 '0'더해주면서 문자'3'으로 변환.문자'3'은 숫자 51
	}

}
