package study;


public class Ex_5_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과목 평균구하기
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 50, 60},
				{50, 50, 70},
		};
		
		int kor=0;
		int eng=0;
		int mat=0;
	    System.out.println("번호  국어  영어  수학  총점  평균 ");
	    System.out.println("=============================");
		
		for (int i = 0; i < score.length; i++) {
			int sum =0;
			float avg = 0.0f;
			
			kor += score[i][0]; //열 합계
			eng += score[i][1];
			mat += score[i][2];
			
			System.out.printf("%3d",i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		
		System.out.printf("총점 %3d %6d %6d%n",kor,eng,mat);
	
	}

}
