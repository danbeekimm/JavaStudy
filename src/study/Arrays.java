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
		System.out.println(java.util.Arrays.toString(arr2)); //복사는 .copyOf
		
		int[] arr3=java.util.Arrays.copyOfRange(arr, 2,4);
		//2부터 4 까지 복사 but 4는 안들어가므로
		System.out.println(java.util.Arrays.toString(arr3));
		//2,3 출력
		
		//오름차순 정렬 sort
		int[]arrsort = {3,5,7,1,6};
		System.out.println(java.util.Arrays.toString(arrsort));
		
		java.util.Arrays.sort(arrsort); //배열 arr을 오름차순으로 정렬
		System.out.println(java.util.Arrays.toString(arrsort));
		
		
		
	}

}
