package study;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1=mm.add(5L, 3L);
		long result2=mm.subtract(5L, 3L);
		long result3=mm.multiply(5L, 3L);
		long maxresult=mm.max(5L, 3L);
		double result4=mm.divide(5L, 3L);
		
		mm.printGugudan(3);
		System.out.println("add"+result1);
		System.out.println("subtract"+result2);
		System.out.println("multiply"+result3);
		System.out.println("divide"+result4);
		System.out.println("maxresult"+maxresult);
	}

}
class MyMath{
	
	void printGugudan(int dan) {
		if (!(2<=dan && dan <=9)) {
			return; //2~9아니면 종료
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
	}
	long add (long a,long b) {
		long result = a+b;
		return result;
	}
	long max(long a,long b) {
		if (a>b) {
			return a;
		}else {
			return b; //조건이 거짓일때도 실행되어야함
		}
	}
	long subtract(long a,long b) {
		return a-b;
	}
	
	long multiply(long a,long b) {
		return a*b;
	}
	
	double divide(long a,long b) {
		return a/b;
	}
}
