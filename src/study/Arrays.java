package study;



public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12},{21,22}};
		
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.deepToString(arr2D));
	
		String[][] str2d= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2d2= {{"aaa","bbb"},{"AAA","BBB"}};
	
		System.out.println(java.util.Arrays.deepEquals(str2d, str2d2));
	
		int[] arr2=java.util.Arrays.copyOf(arr, arr.length);
		System.out.println(java.util.Arrays.toString(arr2)); //����� .copyOf
		
		int[] arr3=java.util.Arrays.copyOfRange(arr, 2,4);
		//2���� 4 ���� ���� but 4�� �ȵ��Ƿ�
		System.out.println(java.util.Arrays.toString(arr3));
		//2,3 ���
		
		//�������� ���� sort
		int[]arrsort = {3,5,7,1,6};
		System.out.println(java.util.Arrays.toString(arrsort));
		
		java.util.Arrays.sort(arrsort); //�迭 arr�� ������������ ����
		System.out.println(java.util.Arrays.toString(arrsort));
		
		
		
	}

}
