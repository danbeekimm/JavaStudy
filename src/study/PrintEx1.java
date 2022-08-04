package study;

public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3); // 정수/정수
		System.out.println(10.0/3);// 실수/정수
		System.out.println(0x1A);
		System.out.printf("%.2f\n",10.0/3);
		System.out.printf("age:%d year:%d\n",26,2022);
		System.out.printf("%d\n",15);
		System.out.printf("%o\n",15);
		System.out.printf("%x\n",15);
		System.out.printf("%s\n",Integer.toBinaryString(15));
		System.out.printf("%#o\n",15); //8진수
		System.out.printf("%#x\n",15); //16진수
		System.out.printf("%#X\n",15); //16진수
	
		float f=123.4567890f;
		System.out.printf("%f\n",f);
		System.out.printf("%e\n",f); 
		System.out.printf("%g\n",123.456789); 
		System.out.printf("%g\n",0.00000001); 
		
		
		System.out.printf("[%5d]%n",10); 
		System.out.printf("[%-5d]%n",10); 
		System.out.printf("[%05d]%n",10); 
		
		System.out.printf("d=%14.10f%n",1.23456789);
		System.out.printf("[%5s]%n",123456789);
		
		
		System.out.printf("[%s]%n","www.naver.com");
		System.out.printf("[%20s]%n","www.naver.com");
		System.out.printf("[%-20s]%n","www.naver.com");//왼쪽정렬
		System.out.printf("[%.8s]%n","www.naver.com");//부분출력
	}

}
