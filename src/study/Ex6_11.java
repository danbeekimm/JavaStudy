package study;


class Data_1{
	int value;
	//Data_1(){} //자동컴파일러 가능해서 생략가능 : 생성자가없어서
}

class Data_2{
	int value;
	Data_2(){
		 //기본생성자
	}
	
	Data_2(int x){ //기본 생성자 추가해야함. 에러남
		//생성자 1개
		value = x;
	}
}


public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
		

	}

}
