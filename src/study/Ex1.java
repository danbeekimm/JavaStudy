package study;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3";
		System.out.println(s.charAt(0)-'0');//����'3'���� ������ '0'�� ���鼭 ���ڷκ���
		System.out.println('3'-'0'+1);//'0'���� 0�� �� ���ڷ� ���� �� +1 ������ >����4
		System.out.println(Integer.parseInt("3")+1);//����3���� ������+1 >����4
		System.out.println("3"+1);//���ڿ�"3"�� ����1�������ν� ���� 31�� ��
		System.out.println(3+'0');//���ڿ� '0'�����ָ鼭 ����'3'���� ��ȯ.����'3'�� ���� 51
	}

}
